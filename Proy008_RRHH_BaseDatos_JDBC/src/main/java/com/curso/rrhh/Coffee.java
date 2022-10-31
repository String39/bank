package com.curso.rrhh;

import java.sql.*;

public class Coffee {

	public static void main(String[] args) {
		try {
			
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
			
			
			
			
			//Crear un table
//			String sentenciaCreate = "CREATE TABLE HR.COFFEES(COF_NAME VARCHAR(32), SUP_ID INTEGER, PRICE FLOAT, SALES INTEGER, TOTAL INTEGER)";
//			st.executeUpdate(sentenciaCreate);
	
			//Introducir datos
//			st.executeUpdate("INSERT INTO HR.COFFEES" + " VALUES ('Colombian', 7.99, 0, 0)");
//			st.executeUpdate("INSERT INTO HR.COFFEES" + " VALUES ('French_Roast', 49, 8.99, 0, 0)");
//			st.executeUpdate("INSERT INTO HR.COFFEES" + " VALUES ('Espresso', 150, 9.99, 0, 0)");
//			st.executeUpdate("INSERT INTO HR.COFFEES" + " VALUES ('Colombian_Decaf', 101, 8.99, 0, 0)");
//			st.executeUpdate("INSERT INTO HR.COFFEES" + " VALUES ('French_Roast_Decaf', 49, 9.99, 0, 0)");
//			
			ResultSet rs =	st.executeQuery("SELECT * FROM HR.COFFEES");
			while(rs.next()) {
				System.out.print(rs.getString(1)+ " "); //columna1
				System.out.print(rs.getString(2) + " "); //columna2
				System.out.print(rs.getString(3) + " "); //columna3
				System.out.print(rs.getString(4) + " "); //columna3
				System.out.println(rs.getString(5)); //columna3
			}

		} catch (SQLException e) {

			System.out.println("Error BD " + e.getMessage());
			e.printStackTrace();

		}
	}

}
