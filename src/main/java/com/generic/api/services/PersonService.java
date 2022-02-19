package com.generic.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.generic.api.generic.IBaseService;
import com.generic.api.model.Employee;
import com.generic.api.model.Person;
import com.generic.api.repository.PersonRepository;

@Service("PersonService")
public class PersonService implements IBaseService<Person, String> {

	@Autowired
	private PersonRepository repository;

	@Override
	public Person findByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public List<Person> findAll() {
		return repository.findAll();
	}

	@Override
	public Person findById(String id) {
		Optional<Person> person = repository.findById(id);
		return person.get();
	}

	@Override
	public Person save(Person object) {
		return repository.save(object);
	}

	@Override
	public void delete(Person object) {
		repository.delete(object);
	}

	@Override
	public void deleteById(String id) {
		repository.deleteById(id);

	}

	@Override
	public Person update(Person entity) {
		Person data = findById(entity.getPersonId());
		if (!ObjectUtils.isEmpty(data)) {
			entity.setPersonId(data.getPersonId());
			return save(entity);
		}
		return null;
	}

	@Override
	public String serviceName() {
		return "Person";
	}
	
	

}
