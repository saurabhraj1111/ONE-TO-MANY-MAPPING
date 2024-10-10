package com.javafever.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafever.entity.Department;
import com.javafever.repository.DepartemtRepository;

@Service
public class DepartmentServiceImpl  implements DepartmentService{

	@Autowired
	private DepartemtRepository repository;
	
	@Override
	public Department addDepartment(Department request) {
		return repository.save(request);
	}

	@Override
	public List<Department> findAllDepartment() {
		return (List<Department>) repository.findAll();
	}

}
