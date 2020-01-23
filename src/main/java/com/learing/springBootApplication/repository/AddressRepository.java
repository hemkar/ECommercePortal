package com.learing.springBootApplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.learing.springBootApplication.beans.Address;

public interface AddressRepository extends CrudRepository<Address,String> {
}
