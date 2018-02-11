package co.jp.impetus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.jp.impetus.dto.LoginDto;
import co.jp.impetus.mapper.LoginMapper;

@Controller
@RequestMapping(value = "/details")
public class DetailsController {

    @Autowired
    LoginMapper mapper;

    public static final String INPUT_COMMAND_NAME = "loginDto";

    @ModelAttribute(INPUT_COMMAND_NAME)
    public LoginDto createLoginDto() {
        LoginDto dto = new LoginDto();
        return dto;
    }

    @RequestMapping(value = "/init", method = RequestMethod.GET)
    public String init(Model model) {
        LoginDto dto = createLoginDto();
        model.addAttribute(INPUT_COMMAND_NAME, dto);

        return "details";
    }

}