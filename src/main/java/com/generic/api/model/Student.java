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
@Table(name = "Student")
public class Student implements Serializable, GenericEntity<Student> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentId;
	private String name;
	private Integer rollNo;
	private String college;

	@Override
	public void update(Student source) {
		this.name = source.getName();
		this.rollNo = source.getRollNo();
		this.college = source.getCollege();
	}

	@Override
	public Long getId() {
		return this.getStudentId();
	}

	@Override
	public Student createNewInstance() {
		Student newInstance = new Student();
		newInstance.update(this);
		return newInstance;
	}
}
