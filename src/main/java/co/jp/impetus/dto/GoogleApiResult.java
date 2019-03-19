package co.jp.impetus.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown=true)
@Data
public class GoogleApiResult {

	public String totalItems;

	@JsonProperty("items")
	public Items[] items;

	public GoogleApiResult () {
	}

	@JsonIgnoreProperties(ignoreUnknown=true)
	@Data
	public static class Items {

		@JsonProperty("volumeInfo")
		public VolumeInfo volumeInfo;

		@JsonProperty("saleInfo")
		public SaleInfo saleInfo;

		public Items () {

		}
	}

	@JsonIgnoreProperties(ignoreUnknown=true)
	@Data
	public static class VolumeInfo{

		public String title;
		public String[] authors;
		public String publisher;
		public String publishedDate;

		@JsonProperty("industryIdentifiers")
		public IndustryIdentifiers[] industryIdentifiers;

		public VolumeInfo () {
		}
	}

	@JsonIgnoreProperties(ignoreUnknown=true)
	@Data
	public static class SaleInfo{
		String saleability;
		public RetailPrice retailPrice;
		public SaleInfo() {

		}
	}

	@JsonIgnoreProperties(ignoreUnknown=true)
	@Data
	public static class RetailPrice {

		public int amount;

		public RetailPrice() {

		}
	}

	@JsonIgnoreProperties(ignoreUnknown=true)
	@Data
	public static class IndustryIdentifiers{

		public String type;
		public String identifier;

		public IndustryIdentifiers () {
		}
	}

}
