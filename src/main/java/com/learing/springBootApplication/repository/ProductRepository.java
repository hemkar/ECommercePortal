package com.learing.springBootApplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.learing.springBootApplication.beans.Product;

public interface ProductRepository extends CrudRepository<Product, String>  {

}
