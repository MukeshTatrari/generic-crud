package com.generic.api.repository;

import org.springframework.stereotype.Repository;

import com.generic.api.generic.GenericRepository;
import com.generic.api.model.Student;

@Repository
public interface StudentRepository extends GenericRepository<Student> {

	Student findByName(String name);

}
