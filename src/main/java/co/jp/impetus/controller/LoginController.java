package co.jp.impetus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.jp.impetus.dto.LoginDto;
import co.jp.impetus.dto.LoginResultDto;
import co.jp.impetus.mapper.LoginMapper;

@Controller
public class LoginController {

    @Autowired
    LoginMapper mapper;

    public static final String INPUT_COMMAND_NAME = "loginDto";

    @ModelAttribute(INPUT_COMMAND_NAME)
    public LoginDto createLoginDto() {
        LoginDto dto = new LoginDto();
        return dto;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String init(Model model) {
        LoginDto dto = createLoginDto();
        model.addAttribute(INPUT_COMMAND_NAME, dto);

        return "login";
    }

    @RequestMapping(value = "/next", method = RequestMethod.POST)
    public ModelAndView next(
            @ModelAttribute(INPUT_COMMAND_NAME) LoginDto dto,
            BindingResult result) throws Exception {

        // 入力チェック
        if (StringUtils.isEmpty(dto.getMailAddress())) {
            result.rejectValue("mailAddress", "errors.required");
        }
        if (StringUtils.isEmpty(dto.getPassword())) {
            result.rejectValue("password", "errors.required");
        }

        ModelAndView view = new ModelAndView();

        LoginResultDto resultDto =  mapper.selectAll(dto);

        // 入力チェックエラーの実装部分
//        if (result.hasErrors()) {
//            view.getModel().putAll(result.getModel());
//            view.setViewName("login");
//            return view;
//        }

        // コミットテスト

        view.setViewName("menu");
        view.addObject("name", resultDto.getId());

        return view;
    }
}