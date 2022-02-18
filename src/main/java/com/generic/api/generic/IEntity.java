package com.generic.api.generic;

import java.io.Serializable;

public interface IEntity<T> extends Serializable {

	public T entityId();
}
