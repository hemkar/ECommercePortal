package com.learing.springBootApplication.services;

import java.util.List;

import com.learing.springBootApplication.beans.Cost;


public interface CostService {
	
	Cost getCost(String id);
	List<Cost> getCosts();
	Cost insertCost(Cost cost);
	Cost updateCost(Cost cost);
	void deleteCost(String id);	
}
