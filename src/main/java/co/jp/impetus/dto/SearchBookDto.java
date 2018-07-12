package co.jp.impetus.dto;

import java.io.Serializable;
import java.util.Date;

public class SearchBookDto implements Serializable {

	/**ISBNコード*/
	private String isbnCode;

	/**作品名*/
	private String prouductionName;

	/**作者名*/
	private String authorName;

	/**発行元*/
	private String publisher;

	/**発効年月日*/
	private Date issuedDate;

	/**税抜価格*/
	private int price;

	public String getIsbnCode() {
		return isbnCode;
	}

	public void setIsbnCode(String isbnCode) {
		this.isbnCode = isbnCode;
	}

	public String getProuductionName() {
		return prouductionName;
	}

	public void setProuductionName(String prouductionName) {
		this.prouductionName = prouductionName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	/*DBに項目はあるがモックに項目がないため、他の項目については割愛する*/
}
