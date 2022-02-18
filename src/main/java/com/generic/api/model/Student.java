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
public class Student implements IEntity<String>{
	
	private String studentId;
	private String name;
	private Integer rollNo;
	private String college;
	@Override
	public String Id() {
		return getStudentId();
	} 

}
