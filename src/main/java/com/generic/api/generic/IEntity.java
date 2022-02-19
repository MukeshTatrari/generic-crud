package com.generic.api.generic;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.generic.api.model.Book;
import com.generic.api.model.Employee;
import com.generic.api.model.Person;
import com.generic.api.model.Student;

@MappedSuperclass

@JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Book.class, name = "Book"),
    @JsonSubTypes.Type(value = Employee.class, name = "Employee"),
    @JsonSubTypes.Type(value = Student.class, name = "Student"),
    @JsonSubTypes.Type(value = Person.class, name = "Person")
})
public class IEntity<T> implements Serializable {
}
