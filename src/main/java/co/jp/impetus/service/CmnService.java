package co.jp.impetus.service;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.apache.commons.codec.binary.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import co.jp.impetus.dto.DetailsDto;
import co.jp.impetus.dto.GoogleApiResult;
import co.jp.impetus.dto.GoogleApiResult.IndustryIdentifiers;
import co.jp.impetus.dto.GoogleApiResult.Items;
import co.jp.impetus.dto.GoogleApiResult.SaleInfo;
import co.jp.impetus.dto.GoogleApiResult.VolumeInfo;
import co.jp.impetus.mapper.CmnApiMapper;

/**汎用的に呼び出される可能性のある処理の集合体*/
@Component
public class CmnService {

	@Autowired
	CmnApiMapper cmnApiMapper;

	private String googleApiUrl = "https://www.googleapis.com/books/v1/volumes?q=intitle:java";
	private String saleability = "NOT_FOR_SALE";

	/**google book Apiにリクエストを送るクラス
	 * @return リクエスト結果*/
	public GoogleApiResult googleBookService () {

		GoogleApiResult apiResult = new GoogleApiResult();;

		try {
			URL url = new URL(googleApiUrl);
	        HttpURLConnection con = (HttpURLConnection) url.openConnection();

	        con.connect();

            InputStream input = con.getInputStream();
            apiResult = new ObjectMapper().readValue(input, GoogleApiResult.class);

            con.disconnect();
		} catch (Exception e) {
			System.out.println(e);
		}

		return apiResult;
	}

	/**書籍情報を作成する*/
	public List<DetailsDto> createBookInfo (GoogleApiResult googleApiResult) {

		Items[] itemAry = googleApiResult.items;
		String authorName = "";
		List<DetailsDto> insertInfoList = new ArrayList<>();

		for (Items item : itemAry) {
			if (Objects.nonNull(item.volumeInfo)
					&& Objects.nonNull(item.volumeInfo.industryIdentifiers)) {

				VolumeInfo volumeInfo = item.volumeInfo;
				DetailsDto insertInfo = new DetailsDto();

				for (IndustryIdentifiers industryIdentifiers : volumeInfo.industryIdentifiers) {
					if (industryIdentifiers.type.equals("ISBN_10")) {
						insertInfo.setIsbnCd(industryIdentifiers.identifier);
					}
				}
				if (Objects.nonNull(volumeInfo.authors)) {
					for (String author : volumeInfo.authors) {
						authorName += ("/" + author);
					}
				}
				if (Objects.nonNull(item.getSaleInfo()) && Objects.nonNull(item.getSaleInfo().getSaleability())) {
					SaleInfo saleInfo = item.getSaleInfo();
					if (!StringUtils.equals(saleInfo.getSaleability(), saleability)) {
						insertInfo.setPrice(saleInfo.getRetailPrice().getAmount());
					}
				}
				insertInfo.setProductionName(volumeInfo.title);
				insertInfo.setPublisher(volumeInfo.publisher);
				insertInfo.setAuthorName(authorName);

				insertInfoList.add(insertInfo);
			}
		}
		return insertInfoList;
	}

	/**書籍情報を登録/更新する*/
	public void insertBookInfo(DetailsDto insertInfo) {

		DetailsDto checkExist = cmnApiMapper.findByIsbn(insertInfo);
		if (Objects.isNull(checkExist)) {
			cmnApiMapper.insertDetail(insertInfo);
		} else {
			cmnApiMapper.updateDetail(insertInfo);
		}
	}
}
