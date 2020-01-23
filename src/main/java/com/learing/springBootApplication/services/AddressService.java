package com.learing.springBootApplication.services;

import java.util.List;

import com.learing.springBootApplication.beans.Address;


public interface AddressService {
	
	Address getAddress(String id);
	List<Address> getAddresss();
	Address insertAddress(Address Address);
	Address updateAddress(Address Address);
	void deleteAddress(String id);	

}
