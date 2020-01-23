package com.learing.springBootApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learing.springBootApplication.beans.Store;
import com.learing.springBootApplication.services.StoreService;

@RestController
public class StoreController {
	
	@Autowired(required=true)
	StoreService storeService;
	
	
	@PutMapping(value="store")
	public Store insertStore(@RequestBody Store store){
		return storeService.insertStore(store);
	}
	
	@GetMapping(value="stores")
	public List<Store> getStores(){
		return storeService.getStores();
		
	}
	
	@GetMapping("/store/{id}")
	public Store getStore(@PathVariable("id") String id){
		return storeService.getStore(id);
	}
	
	@PostMapping(value="store")
	public Store updateStore(@RequestBody Store store){
		return storeService.updateStore(store);
	}

	@DeleteMapping("/deleteStore/{id}")
	public void deleteStore(@PathVariable("id") String id){
		storeService.deleteStore(id);
	}

}
