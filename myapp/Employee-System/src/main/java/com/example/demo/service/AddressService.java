package com.example.demo.service;

import com.example.demo.address.Address;

public interface AddressService {
	
	Address findByEmpId(int EmpId);
	
	void saveAddress(Address address);
	
	void deleteAddressByEmpId(int EmpId);
	
	void updateAddress(Address address);

}
