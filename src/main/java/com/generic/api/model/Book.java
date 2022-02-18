package com.generic.api.model;

import javax.persistence.Entity;

import com.generic.api.generic.IEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements IEntity<Integer>{
	
	private Integer bookId;
	private String name;
	private String isbn;
	private String author;
	
	@Override
	public Integer Id() {
		return this.getBookId();
	}

}
