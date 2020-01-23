package com.learing.springBootApplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.learing.springBootApplication.beans.User;

public interface UserRepository extends CrudRepository<User, String> {
	
}
