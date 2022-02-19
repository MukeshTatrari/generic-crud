package com.generic.api.repository;

import org.springframework.stereotype.Repository;

import com.generic.api.generic.IBaseRepository;
import com.generic.api.model.Book;

@Repository
public interface BookRepository extends IBaseRepository<Book, String>{

	Book findByName(String name);

}
