package com.example.demo.mockito.api;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Employees;

public class EmployeeManager {
	
	@Autowired
	EmployeeDao dao;

	public Listlt,EmployeeVOgt; Object getEmployeeList() {
		return dao.getEmployeeList();
	}

	public Employees getEmployeeById(int id) {
		return dao.getEmployeeById(id);
	}

	public void addEmployee(Employee employee) {
		dao.addEmployee(employee);
	}

}
