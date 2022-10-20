package com.curso.rrhh;

import java.sql.*;


public class EjemploJDBC {
	public static void main(String[] args) {
		// Cargar driver JDBC Oracle
		try {
			// MYsql
			// Class.forName("com.mysql.cj.jdbc.Driver");

			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("cargó ok");
		} catch (ClassNotFoundException e) {
			System.out.println("No cargó driver");
			e.printStackTrace();
			return;
		}

		// crear conexion bd
		String url = "jdbc:oracle:thin:@localhost:49161:xe";
		String usr = "SYSTEM";
		String clave = "oracle";

		try (Connection con = DriverManager.getConnection(url, usr, clave)) {

			System.out.println("conectó ok");
			
			//Consultar la lista de paises
			Statement st = con.createStatement();
			
			//Lanzar la consulta a la bd
			ResultSet rs =	st.executeQuery("SELECT * FROM HR.COUNTRIES");
			
			//recorre el resultado de la consulta
			while(rs.next()) {
				System.out.print(rs.getString(1)+ " "); //columna1
				System.out.print(rs.getString(2) + " "); //columna2
				System.out.println(rs.getString(3)); //columna3
			}
			
		} catch (SQLException e) {

			System.out.println("Error BD " + e.getMessage());
			e.printStackTrace();

		}

	}
}

