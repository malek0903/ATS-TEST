package tn.talan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.talan.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	Product findProductByProductName(String name );
	
	Product findProductByCategory(String categ);
}
