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

import com.learing.springBootApplication.beans.SavedItem;
import com.learing.springBootApplication.services.SavedItemService;

@RestController
public class SavedItemController {
	
	@Autowired(required=true)
	SavedItemService savedItemService;
	
	
	@PutMapping(value="savedItem")
	public SavedItem insertSavedItem(@RequestBody SavedItem savedItem){
		return savedItemService.insertSavedItem(savedItem);
	}
	
	@GetMapping(value="savedItems")
	public List<SavedItem> getSavedItems(){
		return savedItemService.getSavedItems();
	}
	
	@GetMapping("/savedItem/{id}")
	public SavedItem getSavedItem(@PathVariable("id") String id){
		return savedItemService.getSavedItem(id);
	}
	
	@PostMapping(value="savedItem")
	public SavedItem updateSavedItem(@RequestBody SavedItem SavedItem){
		return savedItemService.updateSavedItem(SavedItem);
	}

	@DeleteMapping("/deleteSavedItem/{id}")
	public void deleteSavedItem(@PathVariable("id") String id){
		savedItemService.deleteSavedItem(id);
	}

}
