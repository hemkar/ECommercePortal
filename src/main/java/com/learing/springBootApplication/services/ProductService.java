package com.learing.springBootApplication.services;

import java.util.List;

import com.learing.springBootApplication.beans.Product;


public interface ProductService {

	Product getProduct(String id);
	List<Product> getProducts();
	Product insertProduct(Product product);
	Product updateProduct(Product product);
	void deleteProduct(String id);	

	
}
