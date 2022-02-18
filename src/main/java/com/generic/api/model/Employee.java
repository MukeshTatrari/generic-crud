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
@Table(name = "Employee")
public class Employee implements IEntity<String>{
	
	@Id
	private String empId;
	private String name;
	private String email;
	private boolean status;
	
	@Override
	public String entityId() {
		return this.getEmpId();
	}

}
