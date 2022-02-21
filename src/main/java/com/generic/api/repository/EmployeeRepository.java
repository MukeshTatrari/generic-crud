package com.generic.api.repository;

import org.springframework.stereotype.Repository;

import com.generic.api.generic.GenericRepository;
import com.generic.api.model.Employee;

@Repository
public interface EmployeeRepository extends GenericRepository<Employee> {

	Employee findByName(String name);

}
