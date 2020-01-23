package com.learing.springBootApplication.dto;

public class ProductResponse {
	
	private String name;
    private String productName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public ProductResponse() {
		super();
	}
    
    
}
