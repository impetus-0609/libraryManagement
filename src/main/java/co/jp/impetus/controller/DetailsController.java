package co.jp.impetus.controller;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.jp.impetus.dto.DetailsDto;
import co.jp.impetus.mapper.DetailsMapper;
import co.jp.impetus.service.DetailsService;

@Controller
@RequestMapping(value = "/details")
@MapperScan("co.jp.impetus.mapper.DetailsMapper")
public class DetailsController {

    @Autowired
    DetailsMapper mapper;
    
    @Autowired
    DetailsService service;

    public static final String INPUT_COMMAND_NAME = "detailsDto";

    @RequestMapping(value = "/init", method = RequestMethod.GET)
    public String init(Model model) {

    	List<DetailsDto>  dtoList = createDetailsDto();

    	DetailsDto  dto = service.testLogic(dtoList);

        model.addAttribute(INPUT_COMMAND_NAME, dto);

        return "details";
    }

    @ModelAttribute(INPUT_COMMAND_NAME)
    private List<DetailsDto> createDetailsDto() {

    	List<DetailsDto> resultList = new ArrayList<>();
    	resultList = mapper.select();

        return resultList;
    }

}