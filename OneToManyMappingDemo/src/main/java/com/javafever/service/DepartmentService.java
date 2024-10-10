package com.javafever.service;

import java.util.List;

import com.javafever.entity.Department;

public interface DepartmentService {
	
	public Department addDepartment( Department request);
	
	public List<Department> findAllDepartment();
 
}
