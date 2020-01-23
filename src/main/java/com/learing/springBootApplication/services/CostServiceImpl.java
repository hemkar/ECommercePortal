package com.learing.springBootApplication.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learing.springBootApplication.beans.Cost;
import com.learing.springBootApplication.repository.CostRepository;

@Service
public class CostServiceImpl implements CostService {
	


	@Autowired
	CostRepository CostRepository;
	
	List<Cost> costs= new LinkedList<Cost>();
	
	public Cost getCost(String id) {
		return CostRepository.findById(id).get();
	}

	public List<Cost> getCosts() {
		Iterable<Cost> costs= CostRepository.findAll();
		for(Cost cost: costs) {
			this.costs.add(cost);
		}
		return this.costs;
	}

	public Cost insertCost(Cost cost) {
		return CostRepository.save(cost);
	}

	public Cost updateCost(Cost cost) {
		return CostRepository.save(cost);
	}

	public void deleteCost(String id) {
		CostRepository.deleteById(id);
	}
	

}
