package com.generic.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.generic.api.generic.GenericEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Book")
public class Book implements Serializable, GenericEntity<Book> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bookId;
	private String name;
	private String isbn;
	private String author;

	@Override
	public void update(Book source) {
		this.name=source.getName();
		this.isbn = source.getIsbn();
		this.author= source.getAuthor();
	}

	@Override
	public Long getId() {
		return this.getBookId();
	}

	@Override
	public Book createNewInstance() {
		Book newInstance = new Book();
		newInstance.update(this);
		return newInstance;
	}

}
