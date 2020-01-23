package com.learing.springBootApplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.learing.springBootApplication.beans.Orders;

public interface OrderRepository extends CrudRepository<Orders, String> {

}
