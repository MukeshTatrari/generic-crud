package com.generic.api.generic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBaseRepository<T , ID > extends JpaRepository<T, ID>{}