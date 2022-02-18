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
public class Person implements IEntity<String>{
	
	private String personId;
	private String name;
	 
	@Override
	public String Id() {
		return getPersonId();
	}

}
