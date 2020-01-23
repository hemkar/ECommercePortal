package com.learing.springBootApplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.learing.springBootApplication.beans.Store;

public interface StoreRepository extends CrudRepository<Store, String>{

}
