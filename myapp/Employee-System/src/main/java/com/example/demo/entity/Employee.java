package com.example.demo.entity;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="EMP_SYSTEM")

public class Employee {
	
	                                                      
	 public Employee() {
		 
	    }
	 
	    public Employee(int id, String firstName, String lastName, String email) {
	        super();
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.email = email;
	    }
	  
	    public int id;
	    public String firstName;
	    public String lastName;
	    public String email;
	 
	    //Getters and setters
	 
	    public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
	    public String toString() {
	        return "Employee [id=" + id + ", firstName=" + firstName + ",  lastName=" + lastName + ", email=" + email + "]";
	    }

		public void setId(int id2) {
			// TODO Auto-generated method stub
			
		}

		public Map<String, ?> getId() {
			// TODO Auto-generated method stub
			return null;
		}
}
