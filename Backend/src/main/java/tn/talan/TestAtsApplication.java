package tn.talan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import tn.talan.controller.AtsController;
import tn.talan.dto.ProductDto;
import tn.talan.dto.ReviewDto;
import tn.talan.service.AtsServiceImpl;

@SpringBootApplication
public class TestAtsApplication {
	
	RestTemplate restTemplate = new RestTemplate();
	ObjectMapper objectMapper =  new ObjectMapper();
	@Autowired
	AtsServiceImpl atsService;
	public static void main(String[] args) {
		
		SpringApplication.run(TestAtsApplication.class, args);
	
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		return args -> {
//			String fooResourceUrl
//			  = "http://test.ats-digital.com:3000/products";
//			ResponseEntity<String> response
//			  = restTemplate.getForEntity(fooResourceUrl ,String.class);	
//			ObjectMapper mapper = new ObjectMapper();
//			mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//			JsonNode root = mapper.readTree(response.getBody());
//			JsonNode name = root.path("products");
//			System.out.println(name);
//				
//			ProductDto[] foo = mapper.readValue(name.toString(), ProductDto[].class);
//			
//			for (ProductDto product : foo) {
//				
//				System.out.println("product"+product.toString());
//				atsService.saveProduct(product);
//				
//
//				for (ReviewDto review : product.getReviews()) {
//					System.out.println("review"+review.toString());
//					atsService.saveReview(review,product.getProductName());
//					
//				}	
//			}
//			 
//		};
//		
//	}
	

	

	
	
	

}
