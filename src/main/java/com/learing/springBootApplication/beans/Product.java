package com.learing.springBootApplication.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
    @Id
    private String id;
    private String productName;
    private String description;
    private int price;
    private int discount;
    
  
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
	public Product(String id, String productName, String description, int price, int discount) {
		super();
		this.id = id;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.discount = discount;
	}
	public Product() {
		super();
	}
    
   
    
}