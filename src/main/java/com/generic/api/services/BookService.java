package com.generic.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.generic.api.generic.IBaseService;
import com.generic.api.generic.IEntity;
import com.generic.api.model.Book;
import com.generic.api.repository.BookRepository;

@Service("BookService")
public class BookService implements IBaseService<Book, String> {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book findByName(String name) {
		return bookRepository.findByName(name);
	}

	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	@Override
	public Book findById(String id) {
		Optional<Book> book = bookRepository.findById(id);
		return book.get();
	}

	@Override
	public Book save(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void delete(Book book) {
		bookRepository.delete(book);
	}

	@Override
	public void deleteById(String id) {
		bookRepository.deleteById(id);
	}

	public Book update(Book book) {

		Book data = findById(book.getBookId());
		if (!ObjectUtils.isEmpty(data)) {
			book.setBookId(data.getBookId());
			return save(book);
		}
		return null;
	}

	@Override
	public String serviceName() {
		return "Book";
	}

}
