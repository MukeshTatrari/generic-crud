package com.generic.api.generic;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseService<T, ID> {

	@Autowired
    private IBaseRepository<T, ID> repo;

    public Iterable<T> findAll() {
        return repo.findAll();
    }

    public T save(T vendor) {
        return repo.save(vendor);
    }

    public T update(T vendor) {
        return repo.save(vendor);
    }

    public void delete(ID id) {
        repo.deleteById(id);
    }

    public boolean exists(ID id) {
        return repo.findById(id).isPresent();
    }

    public Optional<T> getById(ID id) {
        return repo.findById(id);
    }

}