package com.generic.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.generic.api.generic.GenericEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Employee")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Employee")
public class Employee implements Serializable, GenericEntity<Employee> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empId;
	private String name;
	private String email;
	private boolean status;

	@Override
	public void update(Employee source) {
		this.name = source.getName();
		this.email = source.getEmail();
		this.status = source.isStatus();
	}

	@Override
	public Long getId() {
		return this.getEmpId();
	}

	@Override
	public Employee createNewInstance() {
		Employee newInstance = new Employee();
		newInstance.update(this);
		return newInstance;
	}

}
