package com.learing.springBootApplication.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learing.springBootApplication.beans.Store;
import com.learing.springBootApplication.repository.StoreRepository;

@Service
public class StoreServiceImpl implements StoreService {
	
	List<Store> store= new ArrayList<Store>();
	
	@Autowired
	StoreRepository storeRepository;
	
	public Store getStore(String id) {
		
		return storeRepository.findById(id).get();
	}

	public List<Store> getStores() {
		Iterable<Store> stores=storeRepository.findAll();
		for(Store store:stores) {
			this.store.add(store);
		}
		return this.store;
	}

	public Store insertStore(Store store) {
		
		return storeRepository.save(store);
	}

	
	public Store updateStore(Store store) {
			return storeRepository.save(store);
	}
	

	public void deleteStore(String id) {
		storeRepository.deleteById(id);
	}

}
