package com.learing.springBootApplication.services;

import java.util.List;

import com.learing.springBootApplication.beans.Orders;

public interface OrderService {
	Orders getOrders(String id);
	List<Orders> getOrderss();
	Orders insertOrders(Orders orders);
	Orders updateOrders(Orders orders);
	void deleteOrders(String id);	
}
