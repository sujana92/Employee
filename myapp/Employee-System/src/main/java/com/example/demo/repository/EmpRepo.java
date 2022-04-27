package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
//import com.example.SearchEmployee.domain.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {
	
	@Query(value = "UPDATE EmpId = :EmpId")
    @Modifying
    String updateEmp(int EmpId);


	
	

}