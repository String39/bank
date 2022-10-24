package com.curso.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class PoolConexiones {
	
	String url = "jdbc:oracle:thin:@localhost:49161:xe";
	String usr = "SYSTEM";
	String clave = "oracle";
	
	public PoolConexiones() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("cargó ok");
		} catch (ClassNotFoundException e) {
			System.out.println("No cargó driver");
			e.printStackTrace();
			throw new RuntimeException("No se pudo cargar el driver");
		}
	}
	
	public Connection getConnection() {
		Connection con;
		try {
			con = DriverManager.getConnection(url, usr, clave);
		}catch(SQLException e) {
			e.printStackTrace();
			throw new  RuntimeException("no se pudo conectar");
		}
		return con;
	}

}
