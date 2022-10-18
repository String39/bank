package com.curso.mercado.servicios;

import java.util.*;

import com.curso.mercado.entidades.Producto;
import com.curso.mercado.persistencia.GenericDAO;
import com.curso.mercado.persistencia.ProductoInMemoryDAO;

public class ProductosService {
	
	GenericDAO<Producto> dao = new ProductoInMemoryDAO();
	
	public void darAltaProducto(Producto p) {
		//validar que p no es null
		//validar descripcion
		//validar precio
		dao.add(p);
	}
	
	public List<Producto> dameTodosLosProductos() {
		return dao.getAll();
	}
}
