package com.learing.springBootApplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.learing.springBootApplication.beans.SavedItem;

public interface SavedItemRepository extends CrudRepository<SavedItem, String> {

}
