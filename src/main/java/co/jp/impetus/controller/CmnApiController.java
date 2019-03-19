package co.jp.impetus.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.jp.impetus.dto.DetailsDto;
import co.jp.impetus.dto.GoogleApiResult;
import co.jp.impetus.service.CmnService;

/**外部との連携を定義するクラスです*/
@Controller
@RequestMapping(value = "/api")
public class CmnApiController {

	@Autowired
	CmnService cmnService;

	/**google book apiから書籍情報を取得する*/
	@RequestMapping(value = "/getBookInfo", method = RequestMethod.GET)
	public void googleApiAccess () {

		GoogleApiResult apiResult = cmnService.googleBookService();
		List<DetailsDto>  insertInfoList = cmnService.createBookInfo(apiResult);

		for (DetailsDto insertInfo : insertInfoList) {
			try {
				if (Objects.nonNull(insertInfo.getIsbnCd())) {
					cmnService.insertBookInfo(insertInfo);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
