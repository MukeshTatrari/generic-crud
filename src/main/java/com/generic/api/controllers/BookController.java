package com.generic.api.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.generic.api.generic.BaseService;
import com.generic.api.generic.IBaseController;
import com.generic.api.generic.IBaseService;
import com.generic.api.generic.IEntity;
import com.generic.api.model.Book;
import com.generic.api.response.APIResponse;
import com.generic.api.response.ResponseStatus;


public class BookController implements IBaseController{
	
	@Autowired
	private BaseService<Book, Integer> bookService;

	@Override
	public <T> ResponseEntity<APIResponse> getEntity(T entityId) {
		
		Optional<Book> book = bookService.getById((Integer) entityId);
		return new ResponseEntity<>(new APIResponse(book, ResponseStatus.SUCCESS), HttpStatus.OK);

	}

	@Override
	public <T> ResponseEntity<?> save(IEntity<T> entity) {
		Book book = bookService.save((Book) entity);
		return new ResponseEntity<>(new APIResponse(book, ResponseStatus.SUCCESS), HttpStatus.CREATED);
	}

	@Override
	public <T> ResponseEntity<?> update(IEntity<T> entity) {
		
		return null;
	}

	@Override
	public <T> void delete(T id) {
		// TODO Auto-generated method stub
		
	}

}
