package com.generic.api.generic;

import java.util.List;

public interface IBaseService<T, ID> {

    T findByName(String name);

    List<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}