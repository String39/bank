package com.curso.mercado.persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import com.curso.mercado.entidades.Producto;

public class ProductoDataBaseDAO implements GenericDAO<Producto>{

	private Connection con;
	
	public ProductoDataBaseDAO(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public void add(Producto entidad) {
//		String insertar = "INSERT INTO HR.PRODUCTOS "
//				+ "(ID_PRODUCTO, DESCRIPCION, PRECIO, STOCK)"
//				+ " VALUES (1, 'Television', 1522.5, 8)";
		String consulta = "SELECT * FROM HR.PRODUCTOS";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(consulta);{
				while(rs.next()) 
				{
					Producto p = new Producto();
					p.setIdProducto(rs.getInt(entidad.getIdProducto()));
					p.setDescripcion(rs.getString(entidad.getDescripcion()));
					p.setPrecio(rs.getDouble((int) entidad.getPrecio()));
					p.setStock(rs.getInt(entidad.getStock()));
				}
			}
				
		}
		catch(SQLException e) {
			
		}
	}

	@Override
	public List<Producto> getAll() {
		ArrayList<Producto> productos = new ArrayList<>();
		String consulta = "SELECT * FROM HR.PRODUCTOS";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(consulta);
			while(rs.next()) {
				Producto p = new Producto();
				p.setIdProducto(rs.getInt("ID_PRODUCTO"));
				p.setDescripcion(rs.getString("DESCRIPCION"));
				p.setPrecio(rs.getDouble("PRECIO"));
				p.setStock(rs.getInt("STOCK"));
				productos.add(p);
			}
			
		} catch (SQLException e) {
			//e.printStackTrace();
			// e para indicar las comunicaciones de oracle (Informacion), sino perderias trazabilidad
			//lanzamos una nueva excepcion pero le pasamos  un e (throwable) para que no pierdala pila de llamadas
			//quien realmente ha lanzado el error en este caso oracle
			throw new RuntimeException("DB JDBC API. " + e.getMessage() , e);
		}
		return productos;
	}

	@Override
	public Producto getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Producto entidad) {
		// TODO Auto-generated method stub
		
	}

}
