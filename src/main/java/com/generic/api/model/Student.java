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
@Table(name = "Student")
public class Student extends IEntity<Student>{
	
	@Id
	@GeneratedValue
	private String studentId;
	private String name;
	private Integer rollNo;
	private String college;
}
