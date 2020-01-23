package com.learing.springBootApplication.services;

import java.util.List;

import com.learing.springBootApplication.beans.User;

public interface UserService {
	
	User getUser(String id);

	List<User> getUsers();

	User insertUser(User user);

	User updateUser(User user);
	
	void deleteUser(String id);	
}
