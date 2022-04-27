package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Employees;

@Repository
public class EmployeeDao
{
private static Employees list = new Employees();

static
{
    list.getEmployeeList().add(new Employee(1, "Lokesh", "Gupta", "user@gmail.com"));
    list.getEmployeeList().add(new Employee(2, "Alex", "Kolenchiskey", "abc@gmail.com"));
    list.getEmployeeList().add(new Employee(3, "David", "Kameron", "titanic@gmail.com"));
}
 
public Employees getAllEmployees() 
{
    return list;
}
 
public <EmployeeVO> void addEmployee(EmployeeVO emp) {
    list.getEmployeeList().add((Employee) emp);
}

public Object getEmployeeList() {
	// TODO Auto-generated method stub
	return null;
}

public Employees getEmployeeById(int id) {
	// TODO Auto-generated method stub
	return null;
}

public void addEmployee(Employee employee) {
	// TODO Auto-generated method stub
	
} 
}
