package com.generic.api.repository;

import org.springframework.stereotype.Repository;

import com.generic.api.generic.IBaseRepository;
import com.generic.api.model.Student;

@Repository
public interface StudentRepository extends IBaseRepository<Student, String>{

	Student findByName(String name);

}
