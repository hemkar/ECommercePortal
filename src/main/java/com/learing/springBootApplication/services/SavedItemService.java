package com.learing.springBootApplication.services;

import java.util.List;

import com.learing.springBootApplication.beans.SavedItem;

public interface SavedItemService {
	SavedItem getSavedItem(String id);

	List<SavedItem> getSavedItems();

	SavedItem insertSavedItem(SavedItem savedItem);

	SavedItem updateSavedItem(SavedItem savedItem);

	void deleteSavedItem(String id);
}
