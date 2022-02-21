package com.generic.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generic.api.generic.GenericController;
import com.generic.api.model.Student;
import com.generic.api.repository.StudentRepository;

@RestController
@RequestMapping("/Student")
public class StudentController extends GenericController<Student> {

    public StudentController(StudentRepository studentRepository) {
        super(studentRepository);
    }

}
