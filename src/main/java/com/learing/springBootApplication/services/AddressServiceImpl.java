package com.learing.springBootApplication.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learing.springBootApplication.beans.Address;
import com.learing.springBootApplication.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {
	

	
	List<Address> addresss= new ArrayList<Address>();
	
	@Autowired
	AddressRepository addressRepository;
	
	public Address getAddress(String id) {
		
		return addressRepository.findById(id).get();
	}

	public List<Address> getAddresss() {
		Iterable<Address> Addresss=addressRepository.findAll();
		for(Address Address:Addresss) {
			this.addresss.add(Address);
		}
		return this.addresss;
	}

	public Address insertAddress(Address Address) {
		
		return addressRepository.save(Address);
	}

	
	public Address updateAddress(Address Address) {
			return addressRepository.save(Address);
	}
	

	public void deleteAddress(String id) {
		addressRepository.deleteById(id);
	}


}
