package com.generic.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.generic.api.generic.IBaseController;
import com.generic.api.generic.IEntity;
import com.generic.api.model.Book;
import com.generic.api.response.APIResponse;
import com.generic.api.response.ResponseStatus;
import com.generic.api.services.BookService;

public class BookController {

//	@Autowired
//	private BookService bookService;
//
//	@Override
//	public <T> ResponseEntity<APIResponse> getEntity(T entityId) {
//
//		Book book = bookService.findById((String) entityId);
//		return new ResponseEntity<>(new APIResponse(book, ResponseStatus.SUCCESS), HttpStatus.OK);
//
//	}
//
//	@Override
//	public <T> ResponseEntity<?> save(IEntity<T> entity) {
//		Book book = bookService.save((Book) entity);
//		return new ResponseEntity<>(new APIResponse(book, ResponseStatus.SUCCESS), HttpStatus.CREATED);
//	}
//
//	@Override
//	public <T> ResponseEntity<?> update(IEntity<T> entity) {
//		Book book = bookService.update((Book) (entity));
//		return new ResponseEntity<>(new APIResponse(book, ResponseStatus.SUCCESS), HttpStatus.OK);
//	}
//
//	@Override
//	public <T> ResponseEntity<APIResponse> delete(T entityId) {
//
//		bookService.deleteById((String) entityId);
//		return new ResponseEntity<>(new APIResponse("Deleted Successfully", ResponseStatus.SUCCESS), HttpStatus.OK);
//
//	}
}
