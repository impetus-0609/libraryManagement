package co.jp.impetus.dto;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.Data;

@Data
public class DetailsDto {

	/*ISBNコード*/
	private String isbnCd ;

	/*作品名*/
	private String productionName ;

	/*作者名*/
	private String authorName ;

	/*発行元*/
	private String publisher ;

	/*発効年月日*/
	private Date issuedDate ;

	/**/
	private String bookPath;

	/*価格*/
	private int price;

	private String category;
	private String description1;
	private String description2;
	private String stock;
	private String language;
	private String resgisterDt;
	private LocalDateTime registerDate;
	private String updateDt;
	private LocalDateTime updateDate;

}
