package com.generic.api.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.generic.api.generic.BaseService;
import com.generic.api.generic.IBaseController;
import com.generic.api.generic.IEntity;
import com.generic.api.model.Employee;
import com.generic.api.response.APIResponse;
import com.generic.api.response.ResponseStatus;

public class EmployeeController implements IBaseController{
	
	@Autowired
	private BaseService<Employee, String> employeeService;

	@Override
	public <T> ResponseEntity<APIResponse> getEntity(T entityId) {
		
		Optional<Employee> employee = employeeService.getById((String) entityId);
		return new ResponseEntity<>(new APIResponse(employee, ResponseStatus.SUCCESS), HttpStatus.OK);

	}

	@Override
	public <T> ResponseEntity<?> save(IEntity<T> entity) {
		Employee employee = employeeService.save((Employee) entity);
		return new ResponseEntity<>(new APIResponse(employee, ResponseStatus.SUCCESS), HttpStatus.CREATED);
	}

	@Override
	public <T> ResponseEntity<?> update(IEntity<T> entity) {
		Employee employee= employeeService.update((Employee) entity);;
		return new ResponseEntity<>(new APIResponse(employee, ResponseStatus.SUCCESS), HttpStatus.OK);
	}

	@Override
	public <T> ResponseEntity<APIResponse> delete(T entityId) {
	
		employeeService.delete((String) entityId);
		return new ResponseEntity<>(new APIResponse("Deleted Successfully", ResponseStatus.SUCCESS), HttpStatus.OK);
		
	}

}
