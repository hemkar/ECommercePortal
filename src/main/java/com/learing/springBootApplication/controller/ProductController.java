package com.learing.springBootApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learing.springBootApplication.beans.Product;
import com.learing.springBootApplication.services.ProductService;

@RestController
public class ProductController {

	
	@Autowired(required=true)
	ProductService productService;
	
	
	@PutMapping(value="product")
	public Product insertProduct(@RequestBody Product product){
		return productService.insertProduct(product);
	}
	
	@GetMapping(value="products")
	public List<Product> getProducts(){
		return productService.getProducts();
	}
	
	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable("id") String id){
		return productService.getProduct(id);
	}
	
	@PostMapping(value="product")
	public Product updateProduct(@RequestBody Product Product){
		return productService.updateProduct(Product);
	}

	@PostMapping("/deleteProduct/{id}")
	public void deleteProduct(@PathVariable("id") String id){
		productService.deleteProduct(id);
	}


}
