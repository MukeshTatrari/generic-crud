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
@Table(name = "Person")
public class Person implements Serializable, GenericEntity<Person> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long personId;
	private String name;

	@Override
	public void update(Person source) {
		this.name = source.getName();
	}

	@Override
	public Long getId() {
		return this.getPersonId();
	}

	@Override
	public Person createNewInstance() {
		Person newInstance = new Person();
		newInstance.update(this);
		return newInstance;
	}

}
