package com.javafever.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javafever.entity.Department;
import com.javafever.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService service;

	@PostMapping("/addDepartment")
	public Department addDeparment( @RequestBody Department request) {
		return service.addDepartment(request);
	}
	
	@GetMapping("/findAllDepartment")
	public List<Department> findAllDepatment(){
		return service.findAllDepartment();
	}
	
}
