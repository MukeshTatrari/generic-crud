package com.generic.api.repository;

import org.springframework.stereotype.Repository;

import com.generic.api.generic.GenericRepository;
import com.generic.api.model.Person;

@Repository
public interface PersonRepository extends GenericRepository<Person> {

	Person findByName(String name);

}
