package com.javafever.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_table")
public class Employee {

	@Id
	private int emp_id;
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private String contactNo;
	
	public Employee() {
		
	}
	
	public Employee(int emp_id, String name, String address, String contactNo) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.address = address;
		this.contactNo = contactNo;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	
}
