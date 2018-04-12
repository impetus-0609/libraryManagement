package co.jp.impetus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.jp.impetus.dto.DetailsDto;
import co.jp.impetus.mapper.LoginMapper;
import co.jp.impetus.service.DetailsService;

@Controller
@RequestMapping(value = "/details")
public class DetailsController {

    @Autowired
    LoginMapper mapper;

    public static final String INPUT_COMMAND_NAME = "detailsDto";

    @RequestMapping(value = "/init", method = RequestMethod.GET)
    public String init(Model model) {

        //LoginDto dto = createLoginDto();
    	DetailsDto dto = createDetailsDto();

        model.addAttribute(INPUT_COMMAND_NAME, dto);

        return "details";
    }

    @ModelAttribute(INPUT_COMMAND_NAME)
    private DetailsDto createDetailsDto() {

    	DetailsDto dto = new DetailsDto();

    	//サービスクラスの作成
    	DetailsService service =  new DetailsService(dto);

    	DetailsDto detailsDto = service.getDetailsDto() ;

        return detailsDto;
    }

}