package com.generic.api.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.generic.api.generic.BaseService;
import com.generic.api.generic.IBaseController;
import com.generic.api.generic.IEntity;
import com.generic.api.model.Person;
import com.generic.api.response.APIResponse;
import com.generic.api.response.ResponseStatus;

public class PersonController  implements IBaseController{
	
	@Autowired
	private BaseService<Person, String> personService;

	@Override
	public <T> ResponseEntity<APIResponse> getEntity(T entityId) {
		
		Optional<Person> person = personService.getById((String) entityId);
		return new ResponseEntity<>(new APIResponse(person, ResponseStatus.SUCCESS), HttpStatus.OK);

	}

	@Override
	public <T> ResponseEntity<?> save(IEntity<T> entity) {
		Person person = personService.save((Person) entity);
		return new ResponseEntity<>(new APIResponse(person, ResponseStatus.SUCCESS), HttpStatus.CREATED);
	}

	@Override
	public <T> ResponseEntity<?> update(IEntity<T> entity) {
		Person person= personService.update((Person) entity);;
		return new ResponseEntity<>(new APIResponse(person, ResponseStatus.SUCCESS), HttpStatus.OK);
	}

	@Override
	public <T> ResponseEntity<APIResponse> delete(T entityId) {
	
		personService.delete((String) entityId);
		return new ResponseEntity<>(new APIResponse("Deleted Successfully", ResponseStatus.SUCCESS), HttpStatus.OK);
		
	}

}
