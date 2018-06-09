package co.jp.impetus.service;

import java.util.List;

import co.jp.impetus.dto.DetailsDto;

public class DetailsService {


	private DetailsDto dto ;


	/**DetailsDtoを返却する*/
	public DetailsDto getDetailsDto() {

		DetailsDto returnDto = this.dto;

		return returnDto;

	}

	/**テスト的に画面に出力する値をセットする*/
	public void testLogic() {

		//とりあえず画面に出力する値たち
		dto.setProuductionName("リスアニ! Vol.32.1「アイドルマスター」音楽大全 永久保存版V");
		dto.setAuthorName("山崎はるか(春日未来役)/郁原ゆう(エミリー スチュアート役)/上田麗奈(高坂海美役)/駒形友梨(高山紗代子役)/伊藤美来(七尾百合子役)/村川梨衣(松田亜利沙役)/木戸衣吹(矢吹可奈役)/愛美(ジュリア役)/小岩井ことり(天空橋朋花役)/斉藤佑圭(永吉 昴役)/戸田めぐみ(舞浜 歩役)/阿部里果(真壁瑞希役)/山口立花子(百瀬莉緒役)/Machico(伊吹 翼役)/稲川英里(大神 環役)/田村奈央(木下ひなた役)/香里有佐(桜守歌織役)/小笠原早紀(野々原 茜役)/麻倉もも(箱崎星梨花役)");
		dto.setPublisherName("エムオン・エンタテインメント");
		dto.setIsbnCode("978-4789772778");

	}

	/***/
	public DetailsDto testLogic(List<DetailsDto> list) {

		dto = list.get(0);

		return dto;

	}

	/**DTOに値をセットする*/
	private void setDetailsData() {

		//DAOの呼び出し

	}

}
