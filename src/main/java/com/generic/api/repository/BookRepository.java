package com.generic.api.repository;

import org.springframework.stereotype.Repository;

import com.generic.api.generic.GenericRepository;
import com.generic.api.model.Book;

@Repository
public interface BookRepository extends GenericRepository<Book> {

	Book findByName(String name);

}
