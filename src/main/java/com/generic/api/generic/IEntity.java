package com.generic.api.generic;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class IEntity<T> implements Serializable {
}
