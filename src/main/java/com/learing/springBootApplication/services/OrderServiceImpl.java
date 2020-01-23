package com.learing.springBootApplication.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learing.springBootApplication.beans.Orders;
import com.learing.springBootApplication.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	List<Orders> orderss= new LinkedList<Orders>();
	
	public Orders getOrders(String id) {
		return orderRepository.findById(id).get();
	}

	public List<Orders> getOrderss() {
		Iterable<Orders> orderss= orderRepository.findAll();
		for(Orders orders: orderss) {
			this.orderss.add(orders);
		}
		return this.orderss;
	}

	public Orders insertOrders(Orders orders) {
		return orderRepository.save(orders);
	}

	public Orders updateOrders(Orders orders) {
		return orderRepository.save(orders);
	}

	public void deleteOrders(String id) {
		orderRepository.deleteById(id);
	}
	
}
