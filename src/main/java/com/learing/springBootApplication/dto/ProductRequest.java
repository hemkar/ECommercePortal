package com.learing.springBootApplication.dto;

import com.learing.springBootApplication.beans.User;

public class ProductRequest {
	
	private User user;

	public ProductRequest(User user) {
		super();
		this.user = user;
	}

	public ProductRequest() {
		super();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
