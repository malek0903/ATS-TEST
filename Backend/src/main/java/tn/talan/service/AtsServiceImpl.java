package tn.talan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.talan.dto.ProductDto;
import tn.talan.dto.ReviewDto;
import tn.talan.entities.Product;
import tn.talan.entities.Review;
import tn.talan.repo.ProductRepository;
import tn.talan.repo.ReviewRepository;
@Service
@Slf4j
public class AtsServiceImpl implements AtsService {    
	@Autowired
	ProductRepository productRepository;

	@Autowired
	ReviewRepository reviewRepository;


	@Override
	public void saveProduct(ProductDto p) {
		
		productRepository.save(
				new Product(	
						p.getColor(),
						p.getCategory(),
						p.getProductName(),
						p.getPrice(),
						p.getDescription(),
						p.getTag(),
						p.getProductMaterial(),
						p.getImageUrl(),
						p.getCreatedAt()					
						)
				);
		
	}


	@Override
	public void saveReview(ReviewDto r,String categ) {
		
		Product p = productRepository.findProductByProductName(categ);
		reviewRepository.save(new Review(
				r.getContent(),
				r.getRating(),
				p
				));
		
	}


	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}


	@Override
	public Product findById(Long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).orElseThrow(IllegalStateException::new);
	}


	@Override
	public Product findByCateg(String categ) {
		// TODO Auto-generated method stub
		return productRepository.findProductByCategory(categ);
	}

}
