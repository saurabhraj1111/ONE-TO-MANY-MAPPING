package com.javafever.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javafever.entity.Department;

@Repository
public interface DepartemtRepository extends CrudRepository<Department, Integer> {

}
