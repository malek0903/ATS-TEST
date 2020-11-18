package tn.talan.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id ;
	@Column(length = 1000)
	private String color;
	@Column(length = 1000)
	private String category;
	@Column(length = 1000)
	private String productName;
	@Column(length = 1000)
	private String price;
	@Column(length = 1000)
	private String description;
	@Column(length = 1000)
	private String tag ;
	@Column(length = 1000)
	private String productMaterial;
	@Column(length = 1000)
	private String imageUrl ;
	@Column(length = 1000)
	private String createdAt ;
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "product")
	private List<Review> reviews =  new ArrayList<Review>();



	@Override
	public String toString() {
		return "Product [id=" + id + ", color=" + color + ", category=" + category + ", productName=" + productName
				+ ", price=" + price + ", description=" + description + ", tag=" + tag + ", productMaterial="
				+ productMaterial + ", imageUrl=" + imageUrl + ", createdAt=" + createdAt + "]";
	}

	
	


	public Product() {
		super();
	}





	public Product( String color, String category, String productName, String price, String description,
			String tag, String productMaterial, String imageUrl, String createdAt) {
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
		
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
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



	public List<Review> getReviews() {
		return reviews;
	}



	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	
	
	
	

}
