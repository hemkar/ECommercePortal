package com.learing.springBootApplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.learing.springBootApplication.beans.Cost;

public interface CostRepository extends CrudRepository<Cost, String> {

}
