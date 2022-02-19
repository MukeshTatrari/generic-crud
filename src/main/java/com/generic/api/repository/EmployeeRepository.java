package com.generic.api.repository;

import org.springframework.stereotype.Repository;

import com.generic.api.generic.IBaseRepository;
import com.generic.api.model.Employee;

@Repository
public interface EmployeeRepository  extends IBaseRepository<Employee, String>{

	Employee findByName(String name);

}
