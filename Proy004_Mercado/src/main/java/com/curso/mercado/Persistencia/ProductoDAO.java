package com.curso.mercado.Persistencia;

import java.util.List;

import com.curso.db.BaseDatosMercado;

/**
 * DAO --- Data Access Object
 */

import com.curso.mercado.entidades.Producto;

public class ProductoDAO implements GenericDAO<Producto>{

	private BaseDatosMercado b = new BaseDatosMercado();
	
	@Override
	public void add(Producto entidad) {
		System.out.println("graba en bd" +entidad);		
	}

	@Override
	public List<Producto> getAll() {
		return null;
	}

	@Override
	public Producto getById(int d) {
		return null;
	}

}
