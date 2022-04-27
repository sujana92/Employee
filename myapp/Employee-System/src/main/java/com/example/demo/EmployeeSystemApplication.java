package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class EmployeeSystemApplication {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeSystemApplication.class);

	public static void main(String[] args) { 
		logger.warn("this is a warn message");
		SpringApplication.run(EmployeeSystemApplication.class, args);
	}

}
 