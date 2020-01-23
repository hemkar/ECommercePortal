package com.learing.springBootApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learing.springBootApplication.beans.Address;
import com.learing.springBootApplication.services.AddressService;

@RestController
public class AddressController {
	
	@Autowired(required=true)
	AddressService addressService;
	
	
	@PutMapping(value="address")
	public Address insertAddress(@RequestBody Address Address){
		return addressService.insertAddress(Address);
	}
	
	@GetMapping(value="address")
	public List<Address> getAddresss(){
		return addressService.getAddresss();
	}
	
	@GetMapping("/address/{id}")
	public Address getAddress(@PathVariable("id") String id){
		return addressService.getAddress(id);
	}
	
	@PostMapping(value="address")
	public Address updateAddress(@RequestBody Address Address){
		return addressService.updateAddress(Address);
	}

	@PostMapping("/deleteAddress/{id}")
	public void deleteAddress(@PathVariable("id") String id){
		addressService.deleteAddress(id);
	}
}
