package tn.talan.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties
public class ProductDto implements Serializable {
	
	
	private String color;
	private String category;
	private String productName;
	private String price;
	private String description;
	private String tag ;
	private String productMaterial;
	private String imageUrl ;
	private String createdAt ;
	
	private List<ReviewDto> reviews = new ArrayList<>();
	
	
	
	
	public ProductDto() {
		super();
	}


	@Override
	public String toString() {
		return "ProductDto [color=" + color + ", category=" + category + ", productName=" + productName + ", price="
				+ price + ", description=" + description + ", tag=" + tag + ", productMaterial=" + productMaterial
				+ ", imageUrl=" + imageUrl + ", createdAt=" + createdAt + "]";
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getTag() {
		return tag;
	}


	public void setTag(String tag) {
		this.tag = tag;
	}


	public String getProductMaterial() {
		return productMaterial;
	}


	public void setProductMaterial(String productMaterial) {
		this.productMaterial = productMaterial;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	public String getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}


	public List<ReviewDto> getReviews() {
		return reviews;
	}


	public void setReviews(List<ReviewDto> reviews) {
		this.reviews = reviews;
	}


	public ProductDto(String color, String category, String productName, String price, String description, String tag,
			String productMaterial, String imageUrl, String createdAt, List<ReviewDto> reviews) {
		super();
		this.color = color;
		this.category = category;
		this.productName = productName;
		this.price = price;
		this.description = description;
		this.tag = tag;
		this.productMaterial = productMaterial;
		this.imageUrl = imageUrl;
		this.createdAt = createdAt;
		this.reviews = reviews;
	}


	
	
	
	
	
	

}
