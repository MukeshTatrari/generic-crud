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
public class Employee implements IEntity<String>{
	
	private String empId;
	private String name;
	private String email;
	private boolean status;
	
	@Override
	public String Id() {
		return this.getEmpId();
	}

}
