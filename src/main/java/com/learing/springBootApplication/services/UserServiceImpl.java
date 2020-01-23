package com.learing.springBootApplication.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learing.springBootApplication.beans.User;
import com.learing.springBootApplication.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	List<User> users= new ArrayList<User>();
	
	@Autowired
	UserRepository userRepository;
	
	public User getUser(String id) {
		
		return userRepository.findById(id).get();
	}

	public List<User> getUsers() {
		Iterable<User> users=userRepository.findAll();
		for(User user:users) {
			this.users.add(user);
		}
		return this.users;
	}

	public User insertUser(User user) {
		
		return userRepository.save(user);
	}

	
	public User updateUser(User user) {
			return userRepository.save(user);
	}
	

	public void deleteUser(String id) {
		userRepository.deleteById(id);
	}

}
