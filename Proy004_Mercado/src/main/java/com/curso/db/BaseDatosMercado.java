package com.curso.db;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import com.curso.mercado.entidades.Producto;

public class BaseDatosMercado {
	private static Map<Integer, Producto> tablaProducto;
	private static int contador = 1;
	
	//iniciar el static tablaProducto
	static {
		tablaProducto = new TreeMap<Integer, Producto>();
		tablaProducto.put(1, new Producto(1, "Libro Recetas", 30.0));
		tablaProducto.put(2, new Producto(2, "Jarron", 23.0));
		tablaProducto.put(3, new Producto(3, "Lápiz", 1.0));
		
	}
	
	private BaseDatosMercado() {
	}
	
	
	//crear los metodos añadir, borrar, modificar solicitar
	//por id y solicitar todos
	public static void añadir(String nombre, double precio) {
		int newId = ++contador;
		Producto p1 = new Producto(newId, nombre, precio);
		tablaProducto.put(newId, p1);
	}
	
	public static void borrar(Producto p) {
		tablaProducto.remove(p);
	}
	
	public static void modificar(Producto p) {
		
	}
	
	public Producto solicitarPorId(int id) {
		return null;
		
	}
	
	public static Collection<Producto> getAll(){
		return tablaProducto.values();
		
	}
	
	
}
