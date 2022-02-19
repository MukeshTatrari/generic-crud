package com.generic.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
@Table(name = "Employee")
public class Employee extends IEntity<Employee>{
	
	@Id
	@GeneratedValue
	private String empId;
	private String name;
	private String email;
	private boolean status;

}
