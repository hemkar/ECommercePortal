package com.learing.springBootApplication.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learing.springBootApplication.beans.Product;
import com.learing.springBootApplication.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository prodcRepository;
	
	List<Product> products= new LinkedList<Product>();
	
	public Product getProduct(String id) {
		return prodcRepository.findById(id).get();
	}

	public List<Product> getProducts() {
		Iterable<Product> products= prodcRepository.findAll();
		for(Product product: products) {
			this.products.add(product);
		}
		return this.products;
	}

	public Product insertProduct(Product product) {
		return prodcRepository.save(product);
	}

	public Product updateProduct(Product product) {
		return prodcRepository.save(product);
	}

	public void deleteProduct(String id) {
		prodcRepository.deleteById(id);
	}
	
}
