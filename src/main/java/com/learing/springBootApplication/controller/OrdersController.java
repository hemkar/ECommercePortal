package com.learing.springBootApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learing.springBootApplication.beans.Orders;
import com.learing.springBootApplication.services.OrderService;

@RestController
public class OrdersController {

	@Autowired(required=true)
	OrderService orderService;
	
	
	@PutMapping(value="orders")
	public Orders insertOrders(@RequestBody Orders orders){
		return orderService.insertOrders(orders);
	}
	
	@GetMapping(value="orderss")
	public List<Orders> getOrderss(){
		return orderService.getOrderss();
	}
	
	@GetMapping("/orders/{id}")
	public Orders getOrders(@PathVariable("id") String id){
		return orderService.getOrders(id);
	}
	
	@PostMapping(value="orders")
	public Orders updateOrders(@RequestBody Orders Orders){
		return orderService.updateOrders(Orders);
	}

	@PostMapping("/deleteOrders/{id}")
	public void deleteOrders(@PathVariable("id") String id){
		orderService.deleteOrders(id);
	}

}
