package co.jp.impetus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.jp.impetus.dto.DetailsDto;
import co.jp.impetus.dto.LoginDto;
import co.jp.impetus.mapper.LoginMapper;

@Controller
@RequestMapping(value = "/details")
public class DetailsController {

    @Autowired
    LoginMapper mapper;

    public static final String INPUT_COMMAND_NAME = "detailsDto";

    @ModelAttribute(INPUT_COMMAND_NAME)
    public LoginDto createLoginDto() {
        LoginDto dto = new LoginDto();



        return dto;
    }

    @ModelAttribute
    private DetailsDto createDetailsDto() {

    	//以下テスト用処理
        DetailsDto detailsDto = new DetailsDto();

        //とりあえず画面に出力する値たち
        detailsDto.setProuductionName("リスアニ! Vol.32.1「アイドルマスター」音楽大全 永久保存版V");
        detailsDto.setAuthorName("山崎はるか(春日未来役)/郁原ゆう(エミリー スチュアート役)/上田麗奈(高坂海美役)/駒形友梨(高山紗代子役)/伊藤美来(七尾百合子役)/村川梨衣(松田亜利沙役)/木戸衣吹(矢吹可奈役)/愛美(ジュリア役)/小岩井ことり(天空橋朋花役)/斉藤佑圭(永吉 昴役)/戸田めぐみ(舞浜 歩役)/阿部里果(真壁瑞希役)/山口立花子(百瀬莉緒役)/Machico(伊吹 翼役)/稲川英里(大神 環役)/田村奈央(木下ひなた役)/香里有佐(桜守歌織役)/小笠原早紀(野々原 茜役)/麻倉もも(箱崎星梨花役)");
        detailsDto.setPublisherName("エムオン・エンタテインメント");
        detailsDto.setIsbnCode("978-4789772778");

        return detailsDto;
    }

    @RequestMapping(value = "/init", method = RequestMethod.GET)
    public String init(Model model) {

        //LoginDto dto = createLoginDto();
    	DetailsDto dto = createDetailsDto();

        model.addAttribute(INPUT_COMMAND_NAME, dto);

        return "details";
    }

}