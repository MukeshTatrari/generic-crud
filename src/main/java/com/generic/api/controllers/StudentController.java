package com.generic.api.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.generic.api.generic.BaseService;
import com.generic.api.generic.IBaseController;
import com.generic.api.generic.IEntity;
import com.generic.api.model.Student;
import com.generic.api.response.APIResponse;
import com.generic.api.response.ResponseStatus;

public class StudentController implements IBaseController{
	
	@Autowired
	private BaseService<Student, String> studentService;

	@Override
	public <T> ResponseEntity<APIResponse> getEntity(T entityId) {
		
		Optional<Student> student = studentService.getById((String) entityId);
		return new ResponseEntity<>(new APIResponse(student, ResponseStatus.SUCCESS), HttpStatus.OK);

	}

	@Override
	public <T> ResponseEntity<?> save(IEntity<T> entity) {
		Student student = studentService.save((Student) entity);
		return new ResponseEntity<>(new APIResponse(student, ResponseStatus.SUCCESS), HttpStatus.CREATED);
	}

	@Override
	public <T> ResponseEntity<?> update(IEntity<T> entity) {
		Student student= studentService.update((Student) entity);;
		return new ResponseEntity<>(new APIResponse(student, ResponseStatus.SUCCESS), HttpStatus.OK);
	}

	@Override
	public <T> ResponseEntity<APIResponse> delete(T entityId) {
	
		studentService.delete((String) entityId);
		return new ResponseEntity<>(new APIResponse("Deleted Successfully", ResponseStatus.SUCCESS), HttpStatus.OK);
		
	}

}
