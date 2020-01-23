package com.learing.springBootApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learing.springBootApplication.beans.Cost;
import com.learing.springBootApplication.services.CostService;

@RestController
public class CostController {

	
	@Autowired(required=true)
	CostService costService;
	
	
	@PutMapping(value="cost")
	public Cost insertCost(@RequestBody Cost cost){
		return costService.insertCost(cost);
	}
	
	@GetMapping(value="costs")
	public List<Cost> getCosts(){
		return costService.getCosts();
	}
	
	@GetMapping("/cost/{id}")
	public Cost getCost(@PathVariable("id") String id){
		return costService.getCost(id);
	}
	
	@PostMapping(value="cost")
	public Cost updateCost(@RequestBody Cost Cost){
		return costService.updateCost(Cost);
	}

	@PostMapping("/deleteCost/{id}")
	public void deleteCost(@PathVariable("id") String id){
		costService.deleteCost(id);
	}


}
