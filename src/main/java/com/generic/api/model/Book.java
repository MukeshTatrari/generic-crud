package com.generic.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.generic.api.generic.IEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Book")
public class Book implements IEntity<Integer>{
	
	@Id
	private Integer bookId;
	private String name;
	private String isbn;
	private String author;
	
	@Override
	public Integer entityId() {
		return this.getBookId();
	}

}
