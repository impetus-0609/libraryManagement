package co.jp.impetus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.jp.impetus.dto.LoginDto;
import co.jp.impetus.dto.SearchBookdDto;
import co.jp.impetus.mapper.LoginMapper;
import co.jp.impetus.mapper.SearchMapper;

@Controller
@RequestMapping(value = "/search")
public class SearchController {

    @Autowired
    LoginMapper mapper;

    @Autowired
    SearchMapper searchMapper;

    public static final String INPUT_COMMAND_NAME = "loginDto";
    public static final String SEARCH_COMMAND_NAME = "searchBookDto";

    @ModelAttribute(INPUT_COMMAND_NAME)
    public LoginDto createLoginDto() {
        LoginDto dto = new LoginDto();
        return dto;
    }

    @ModelAttribute(SEARCH_COMMAND_NAME)
    public SearchBookdDto createSearchBookDto() {
    	SearchBookdDto dto = new SearchBookdDto();
        return dto;
    }

    @RequestMapping(value = "/init", method = RequestMethod.GET)
    public String init(Model model) {
        LoginDto dto = createLoginDto();
        model.addAttribute(INPUT_COMMAND_NAME, dto);

        return "search";
    }

    /**
     * テスト用
     * @param model
     * @return
     */
    @RequestMapping(value = "/comfirm", method = RequestMethod.GET)
    public String initTest(Model testModel) {
    	SearchBookdDto resultDto = createSearchBookDto();
    	resultDto = searchMapper.selectSearchBookOne();
        testModel.addAttribute(SEARCH_COMMAND_NAME, resultDto);

        return "search";
    }

}