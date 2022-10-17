package com.curso.mercado.Persistencia;

import java.util.*;

public interface GenericDAO<T> {
	public void add(T entidad);
	public List<T> getAll();
	public T getById(int d);
}
