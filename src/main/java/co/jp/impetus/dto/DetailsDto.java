package co.jp.impetus.dto;

import java.io.Serializable;
import java.util.Date;

public class DetailsDto implements Serializable {

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

	private Integer price ;
	
	private String category;
	private String bookPath;
	private String description1;
	private String description2;
	private String stock;
	private String language;
	private String resgisterDt;
	private Date registerDate;
	private String updateDt;
	private Date updateDate;

	/**
	 * @return isbn_cd
	 */
	public String getIsbnCd() {
		return isbnCd;
	}
	/**
	 * @param isbn_cd セットする isbn_cd
	 */
	public void setIsbnCd(String isbnCd) {
		this.isbnCd = isbnCd;
	}
	/**
	 * @return productionName
	 */
	public String getProductionName() {
		return productionName;
	}
	/**
	 * @param productionName セットする productionName
	 */
	public void setProductionName(String productionName) {
		this.productionName = productionName;
	}
	/**
	 * @return authorName
	 */
	public String getAuthorName() {
		return authorName;
	}
	/**
	 * @param authorName セットする authorName
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	/**
	 * @return publisher
	 */
	public String getPublisher() {
		return publisher;
	}
	/**
	 * @param publisher セットする publisher
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * @return issuedDate
	 */
	public Date getIssuedDate() {
		return issuedDate;
	}
	/**
	 * @param issuedDate セットする issuedDate
	 */
	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}
	/**
	 * @return price
	 */
	public Integer getPrice() {
		return price;
	}
	/**
	 * @param price セットする price
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}
	/**
	 * @return category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category セットする category
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return bookPath
	 */
	public String getBookPath() {
		return bookPath;
	}
	/**
	 * @param bookPath セットする bookPath
	 */
	public void setBookPath(String bookPath) {
		this.bookPath = bookPath;
	}
	/**
	 * @return description1
	 */
	public String getDescription1() {
		return description1;
	}
	/**
	 * @param description1 セットする description1
	 */
	public void setDescription1(String description1) {
		this.description1 = description1;
	}
	/**
	 * @return description2
	 */
	public String getDescription2() {
		return description2;
	}
	/**
	 * @param description2 セットする description2
	 */
	public void setDescription2(String description2) {
		this.description2 = description2;
	}
	/**
	 * @return stock
	 */
	public String getStock() {
		return stock;
	}
	/**
	 * @param stock セットする stock
	 */
	public void setStock(String stock) {
		this.stock = stock;
	}
	/**
	 * @return language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language セットする language
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * @return resgisterDt
	 */
	public String getResgisterDt() {
		return resgisterDt;
	}
	/**
	 * @param resgisterDt セットする resgisterDt
	 */
	public void setResgisterDt(String resgisterDt) {
		this.resgisterDt = resgisterDt;
	}
	/**
	 * @return registerDate
	 */
	public Date getRegisterDate() {
		return registerDate;
	}
	/**
	 * @param registerDate セットする registerDate
	 */
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	/**
	 * @return updateDt
	 */
	public String getUpdateDt() {
		return updateDt;
	}
	/**
	 * @param updateDt セットする updateDt
	 */
	public void setUpdateDt(String updateDt) {
		this.updateDt = updateDt;
	}
	/**
	 * @return updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}
	/**
	 * @param updateDate セットする updateDate
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}



}