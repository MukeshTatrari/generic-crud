package com.generic.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.generic.api.generic.IBaseService;
import com.generic.api.model.Person;
import com.generic.api.model.Student;
import com.generic.api.repository.StudentRepository;

@Service("StudentService")
public class StudentService implements IBaseService<Student, String> {

	@Autowired
	private StudentRepository repository;

	@Override
	public Student findByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public List<Student> findAll() {
		return repository.findAll();
	}

	@Override
	public Student findById(String id) {
		Optional<Student> student = repository.findById(id);
		return student.get();
	}

	@Override
	public Student save(Student object) {
		return repository.save(object);
	}

	@Override
	public void delete(Student object) {
		repository.delete(object);
	}

	@Override
	public void deleteById(String id) {

		repository.deleteById(id);
	}

	@Override
	public Student update(Student entity) {

		Student data = findById(entity.getStudentId());
		if (!ObjectUtils.isEmpty(data)) {
			entity.setStudentId(data.getStudentId());
			return save(entity);
		}
		return null;
	}

	@Override
	public String serviceName() {
		return "Student";
	}

}
