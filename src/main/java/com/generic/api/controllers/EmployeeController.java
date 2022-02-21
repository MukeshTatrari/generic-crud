package com.generic.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generic.api.generic.GenericController;
import com.generic.api.model.Employee;
import com.generic.api.repository.EmployeeRepository;

@RestController
@RequestMapping("/Employee")
public class EmployeeController extends GenericController<Employee> {

    public EmployeeController(EmployeeRepository employeeRepository) {
        super(employeeRepository);
    }

}
