package com.learing.springBootApplication.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learing.springBootApplication.beans.SavedItem;
import com.learing.springBootApplication.repository.SavedItemRepository;

@Service
public class SavedItemServiceImpl implements SavedItemService {

	
	List<SavedItem> savedItem= new ArrayList<SavedItem>();
	
	@Autowired
	SavedItemRepository savedItemRepository;
	
	public SavedItem getSavedItem(String id) {
		
		return savedItemRepository.findById(id).get();
	}

	public List<SavedItem> getSavedItems() {
		Iterable<SavedItem> savedItems=savedItemRepository.findAll();
		for(SavedItem savedItem:savedItems) {
			this.savedItem.add(savedItem);
		}
		return this.savedItem;
	}

	public SavedItem insertSavedItem(SavedItem savedItem) {
		
		return savedItemRepository.save(savedItem);
	}

	
	public SavedItem updateSavedItem(SavedItem savedItem) {
			return savedItemRepository.save(savedItem);
	}
	

	public void deleteSavedItem(String id) {
		savedItemRepository.deleteById(id);
	}


	
}
