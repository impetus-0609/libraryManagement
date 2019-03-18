package co.jp.impetus.dto;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BookInfoDto implements Serializable {

	private TopTier topTier;

	@Component
	public static class TopTier implements Serializable {
		private Items[] items;

		public Items[] getItems() {
			return items;
		}
		public void setItems(Items[] items) {
			this.items = items;
		}
	}
	@Component
	public static class Items implements Serializable {

		private List<VolumeInfo> volumeInfo;

		public List<VolumeInfo> getVolumeInfo() {
			return volumeInfo;
		}

		public void setVolumeInfo(List<VolumeInfo> volumeInfo) {
			this.volumeInfo = volumeInfo;
		}
	}
	@Component
	public static class VolumeInfo implements Serializable {

		private String title;
		private String authors;
		private String publishedDate;
		private String description;
		private List<IndustryIdentifiers> industryIdentifiers;

		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthors() {
			return authors;
		}
		public void setAuthors(String authors) {
			this.authors = authors;
		}
		public String getPublishedDate() {
			return publishedDate;
		}
		public void setPublishedDate(String publishedDate) {
			this.publishedDate = publishedDate;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public List<IndustryIdentifiers> getIndustryIdentifiers() {
			return industryIdentifiers;
		}
		public void setIndustryIdentifiers(List<IndustryIdentifiers> industryIdentifiers) {
			this.industryIdentifiers = industryIdentifiers;
		}
	}
	@Component
	public static class IndustryIdentifiers implements Serializable {
		private String type;
		private String identifier;

		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getIdentifier() {
			return identifier;
		}
		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}
	}
	public TopTier getTopTier() {
		return topTier;
	}
	public void setTopTier(TopTier topTier) {
		this.topTier = topTier;
	}
}
