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
@Table(name = "Person")
public class Person implements IEntity<String>{
	
	@Id
	private String personId;
	private String name;
	 
	@Override
	public String entityId() {
		return getPersonId();
	}

}
