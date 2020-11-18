package tn.talan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.talan.entities.Product;
import tn.talan.service.AtsServiceImpl;

@RestController
@RequestMapping(path = "/products")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AtsController {
	
	@Autowired
	AtsServiceImpl atsService ;
	

	@GetMapping("categ/{categ}")
	@ResponseBody
	public Product findByCateg(@PathVariable("categ")String categ) {
		return atsService.findByCateg(categ);
	}

	@GetMapping("{id}")
	@ResponseBody
	public Product findById(@PathVariable("id") Long id) {
		return atsService.findById(id);
	}

	@GetMapping
	@ResponseBody
	public List<Product> getAllProduct() {
		return atsService.getAllProduct();
	}
	
	
	

	

}
