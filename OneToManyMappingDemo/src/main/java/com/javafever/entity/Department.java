package com.javafever.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "department_tbl")
public class Department {

	@Id
	@GeneratedValue
	private int dept_id;
	
	@Column
	private String name;
	
	@OneToMany(targetEntity = Employee.class ,cascade = CascadeType.ALL )
	@JoinColumn(name = "emp_dept_id" ,referencedColumnName = "dept_id")
	private List<Employee> employee;
	
	public Department() {
		
	}

	public Department(int dept_id, String name, List<Employee> employee) {
		super();
		this.dept_id = dept_id;
		this.name = name;
		this.employee = employee;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
}
