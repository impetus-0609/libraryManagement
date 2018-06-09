package co.jp.impetus.dto;

import java.io.Serializable;
import java.util.Date;

public class DetailsDto implements Serializable {

	/*ISBNコード*/
	private String isbn_cd ;

	/*作品名*/
	private String production_name ;

	/*作者名*/
	private String author_name ;

	/*発行元*/
	private String publisher ;

	/*発効年月日*/
	private Date issued_date ;

	/*DBに項目はあるがモックに項目がないため、他の項目については割愛する*/


	/**
	 * ISBNコードを取得する
	 * @return String isbnCode
	 */
	public String getIsbnCode() {
		return isbn_cd;
	}

	/**
	 * ISBNコードを設定する
	 * @param String isbnCode
	 */
	public void setIsbnCode(String isbn_cd) {
		this.isbn_cd = isbn_cd;
	}

	/**
	 * 作品名を取得する
	 * @return String prouductionName
	 */
	public String getProuductionName() {
		return production_name;
	}

	/**
	 * 作品名を設定する
	 * @param String prouductionName
	 */
	public void setProuductionName(String prouductionName) {
		this.production_name = prouductionName;
	}

	/**
	 * 作者名を取得する
	 * @return author_name
	 */
	public String getAuthorName() {
		return author_name;
	}

	/**
	 * 作者名を設定する
	 * @param author_name セットする author_name
	 */
	public void setAuthorName(String author_name) {
		this.author_name = author_name;
	}

	/**
	 * 発行元を取得する
	 * @return publisherName
	 */
	public String getPublisherName() {
		return publisher;
	}

	/**
	 * 発行元を設定する
	 * @param publisherName セットする publisherName
	 */
	public void setPublisherName(String publisherName) {
		this.publisher = publisherName;
	}

	/**
	 * 発効年月日を取得する
	 * @return issuedDate
	 */
	public Date getIssuedDate() {
		return issued_date;
	}

	/**
	 * 発効年月日を設定する
	 * @param issuedDate セットする issuedDate
	 */
	public void setIssuedDate(Date issuedDate) {
		this.issued_date = issuedDate;
	}

}
