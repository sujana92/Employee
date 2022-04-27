package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EmpRepo;

@Repository
@CacheConfig(cacheNames = "product")
@Service
public abstract class EmpServiceImpl implements  EmpService {
	
	
	private EmpRepo empRepo;
	 public EmpServiceImpl() {
     }
     @Autowired
     public void setEmpRepo(EmpRepo empRepository) {
            this.empRepo = empRepository;
     }
    @Autowired
    public EmpServiceImpl(EmpRepo empRepository) {
            this.empRepo = empRepository;
    }

}
