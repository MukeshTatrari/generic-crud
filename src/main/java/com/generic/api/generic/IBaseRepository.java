package com.generic.api.generic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IBaseRepository<T extends IEntity<T> , ID > extends JpaRepository<T, ID>{}
