package com.example.demo.dao;

import com.example.demo.address.Address;

public interface AddressDao {
	
	Address findByEmpId(int EmpId);
	
	void  saveAdress(Address address);
	
	void deleteAdressByEmpId(int EmpId);

}
