package com.learing.springBootApplication.services;

import java.util.List;

import com.learing.springBootApplication.beans.Store;

public interface StoreService {
	Store getStore(String id);

	List<Store> getStores();

	Store insertStore(Store store);

	Store updateStore(Store store);
	
	void deleteStore(String id);	

}
