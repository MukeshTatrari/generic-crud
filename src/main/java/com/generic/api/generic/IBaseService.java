package com.generic.api.generic;

import java.util.List;

import org.springframework.stereotype.Service;

public interface IBaseService<T, ID> {


	T findByName(String name);

    List<T> findAll();

    T findById(ID id);

    T save(T entity);

    void delete(T entity);
    
    T update(T entity);

    void deleteById(String id);
    
    String serviceName();
}