package tn.talan.service;

import java.util.List;

import tn.talan.dto.ProductDto;
import tn.talan.dto.ReviewDto;
import tn.talan.entities.Product;
import tn.talan.entities.Review;

public interface AtsService {

	 List<Product> getAllProduct();
	 void saveProduct(ProductDto p);
	 void saveReview(ReviewDto r,String categ);
	 Product findByCateg(String categ);
	 Product findById(Long id);
	 
}
