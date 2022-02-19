package com.generic.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.generic.api.generic.IBaseService;
import com.generic.api.model.Employee;
import com.generic.api.repository.EmployeeRepository;

@Service("EmployeeService")
public class EmployeeService implements IBaseService<Employee, String> {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public Employee findByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public List<Employee> findAll() {

		return repository.findAll();
	}

	@Override
	public Employee findById(String id) {
		Optional<Employee> employee = repository.findById(id);
		return employee.get();

	}

	@Override
	public Employee save(Employee object) {
		return repository.save(object);
	}

	@Override
	public void delete(Employee object) {

		repository.delete(object);
	}

	@Override
	public void deleteById(String id) {
		repository.deleteById(id);

	}

	@Override
	public Employee update(Employee entity) {
		Employee data = findById(entity.getEmpId());
		if (!ObjectUtils.isEmpty(data)) {
			entity.setEmpId(data.getEmpId());
			return save(entity);
		}
		return null;
	}

	@Override
	public String serviceName() {
		return "Employee";
	}
}