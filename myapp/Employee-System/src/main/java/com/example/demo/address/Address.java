package com.example.demo.address;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.entity.Employee;

@Entity
@Table(name="EMP_SYSTEM")

public class Address implements Serializable {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int EmpId;
	
	@Column(name ="address_line1", length=100)
	private String addressLine1;
	
	@Column(name ="address_line2", length=100)
	private String addressLine2;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country")
	private String country;
	
	@Column(name="zip_code")
	private String zip_code;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="EmpId")
	private Employee employee;
	
	public int getEmpId() {
		return EmpId;
	}
	
	public String getAddressLine1() {
		return addressLine1;
		
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	
	public String getAddressLine2() {
		return addressLine2;
	}
	
	public void setAddressLine2(String addressLine2) {
		this.addressLine2= addressLine2;  
	}
	
	
	
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}




	/**
	 * 
	 */
	private static final long serialVersionUID = -1058223850234534921L;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
}
	
	 