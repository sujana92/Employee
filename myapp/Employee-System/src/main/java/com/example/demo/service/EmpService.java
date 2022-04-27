package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;


@Service
public interface EmpService {
	  List<Employee> findEmployeeByEmployeeNameStartingWith(String name); 
	  
	    List<Employee> findEmployeeByEmployeeRole(String role);         
	    
	    List<Employee> findAll();
	    Employee save(Employee employee);
	    void delete(long employeeId);
	
	}