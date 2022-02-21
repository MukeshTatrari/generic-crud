package com.generic.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generic.api.generic.GenericController;
import com.generic.api.model.Person;
import com.generic.api.repository.PersonRepository;

@RestController
@RequestMapping("/Person")
public class PersonController extends GenericController<Person> {

    public PersonController(PersonRepository personRepository) {
        super(personRepository);
    }
}
