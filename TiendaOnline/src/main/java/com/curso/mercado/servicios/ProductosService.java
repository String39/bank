package com.curso.mercado.servicios;

import java.util.List;

import com.curso.db.PoolConexiones;
import com.curso.mercado.entidades.Producto;
import com.curso.mercado.persistencia.GenericDAO;
import com.curso.mercado.persistencia.ProductoDataBaseDAO;
import com.curso.mercado.persistencia.ProductoJPADAO;

public class ProductosService {
	private GenericDAO<Producto> dao;
	
	
	public ProductosService() {
		//PoolConexiones pool = new PoolConexiones();
		//this.dao = new ProductoDataBaseDAO(pool.getConnection());
		this.dao = new ProductoJPADAO();
	}

	public void darAtaUnProducto(Producto p) {
		//validar que p no es null
		//validar descrlipcion
		//validar precio
		dao.add(p);
	}
	
	public List<Producto> dameTodosLosProductos(){
		return dao.getAll();
	}
}
