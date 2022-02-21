package com.generic.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generic.api.generic.GenericController;
import com.generic.api.model.Book;
import com.generic.api.repository.BookRepository;

@RestController
@RequestMapping("/Book")
public class BookController extends GenericController<Book> {

    public BookController(BookRepository bookRepository) {
        super(bookRepository);
    }

}
