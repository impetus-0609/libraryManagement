package co.jp.impetus.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class DetailsDto implements Serializable {

	/*ISBNコード*/
	private String isbnCode ;

	/*作品名*/
	private String prouductionName ;

	/*作者名*/
	private String authorName ;

	/*発行元*/
	private String publisherName ;

	/*発効年月日*/
	private Date issuedDate ;

	/*DBに項目はあるがモックに項目がないため、他の項目については割愛する*/


	/**
	 * ISBNコードを取得する
	 * @return String isbnCode
	 */
	public String getIsbnCode() {
		return isbnCode;
	}

	/**
	 * ISBNコードを設定する
	 * @param String isbnCode
	 */
	public void setIsbnCode(String isbnCode) {
		this.isbnCode = isbnCode;
	}

	/**
	 * 作品名を取得する
	 * @return String prouductionName
	 */
	public String getProuductionName() {
		return prouductionName;
	}

	/**
	 * 作品名を設定する
	 * @param String prouductionName
	 */
	public void setProuductionName(String prouductionName) {
		this.prouductionName = prouductionName;
	}

	/**
	 * 作者名を取得する
	 * @return author_name
	 */
	public String getAuthorName() {
		return authorName;
	}

	/**
	 * 作者名を設定する
	 * @param author_name セットする author_name
	 */
	public void setAuthorName(String author_name) {
		this.authorName = author_name;
	}

	/**
	 * 発行元を取得する
	 * @return publisherName
	 */
	public String getPublisherName() {
		return publisherName;
	}

	/**
	 * 発行元を設定する
	 * @param publisherName セットする publisherName
	 */
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	/**
	 * 発効年月日を取得する
	 * @return issuedDate
	 */
	public Date getIssuedDate() {
		return issuedDate;
	}

	/**
	 * 発効年月日を設定する
	 * @param issuedDate セットする issuedDate
	 */
	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}

}
