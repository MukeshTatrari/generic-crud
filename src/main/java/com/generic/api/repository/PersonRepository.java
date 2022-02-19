package com.generic.api.repository;

import org.springframework.stereotype.Repository;

import com.generic.api.generic.IBaseRepository;
import com.generic.api.model.Person;

@Repository
public interface PersonRepository extends IBaseRepository<Person, String>{

	Person findByName(String name);

}
