package com.learing.springBootApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learing.springBootApplication.beans.User;
import com.learing.springBootApplication.services.UserService;

/*@Controller + @ResponseBody = @RestController */
@RestController
public class UserController {
	
	@Autowired(required=true)
	UserService userService;
	
	
	@PutMapping(value="user")
	public User insertUser(@RequestBody User user){
		return userService.insertUser(user);
	}
	
	@GetMapping(value="users")
	public List<User> getUsers(){
		return userService.getUsers();
		
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id") String id){
		return userService.getUser(id);
	}
	
	@PostMapping(value="user")
	public User updateUser(@RequestBody User user){
		return userService.updateUser(user);
	}

	@PostMapping("/deleteUser/{id}")
	public void deleteUser(@PathVariable("id") String id){
		userService.deleteUser(id);
	}
}
