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
			
//			//Lanzar la consulta a la bd
			ResultSet rs =	st.executeQuery("SELECT * FROM HR.COUNTRIES");
//			
//			//recorre el resultado de la consulta
			while(rs.next()) {
				System.out.print(rs.getString(1)+ " "); //columna1
				System.out.print(rs.getString(2) + " "); //columna2
				System.out.println(rs.getString(3)); //columna3
			}
			
			//----------------------------------------------------------------------------//
			
			//Insertar un pais
//			String sentenciaInsert= "INSERT INTO HR.COUNTRIES" + " VALUES ('XX','PAISXX',4)";
//			int regAfectado = st.executeUpdate(sentenciaInsert);
//			System.out.printf("Inserto %d registros" , regAfectado);
			
			
			//---------------------------------------------------------------------------//
			
			//Connection
			//			Statement
			//			PreparedStatment
			//			CallableStatement (llama a procedimientos)
			
			//sentencia sql SELECT, INSERT, DELETE,.........
			//Statement sentencia = con.createStatement();  mala practica
			
//			String modifPais=" UPDATE HR.COUNTRIES " 
//					+ " SET COUNTRY_NAME = ? "
//					+ " WHERE COUNTRY_ID = ? ";
//			PreparedStatement ps = con.prepareStatement(modifPais);
			
			String pais = "ArgentinaModif2";
			String codigo = "AR";
//			
//			//PASAR PARAMETROS
//			ps.setString(1, pais);
//			ps.setString(2, codigo);
//			//ps.setInt(2, codigo);
//			
//			System.out.println(modifPais);
//			
//			int rows = ps.executeUpdate();
//			System.out.println("Has modificado el pais " + rows);
//			
			
			//--------------------------------------------------------------------//
			//CREAR UN OBJETO ORACLE PROCEDIMIENTO ALMACENADO
			String crearProcAlmacenado = "CREATE OR REPLACE PROCEDURE HR.Ver_NombrePais "
					+ "(PARAM_COD_PAIS IN VARCHAR , PARAM_NOMBRE_PAIS OUT VARCHAR) "
					+ "AS "
					+ "BEGIN "
					+ "		SELECT COUNTRY_NAME INTO PARAM_NOMBRE_PAIS "
					+ "		FROM COUNTRIES "
					+ "		WHERE COUNTRY_ID = PARAM_COD_PAIS; "
					+ "END; ";
			
			con.createStatement().execute(crearProcAlmacenado);
			
			//LLAMA DESDE JAVA A UNA PROCE ALMACENADO
			//CallableStatement solo en procesos almacenados
			//? son los valores que les pides
			CallableStatement call = con.prepareCall("{call HR.Ver_NombrePais(?,?)}" );
			
			//PREPARAMOS EL CODIGO DE ENTRADA
			call.setString(1, codigo);
			
			//PREPARAR PARAMeTRO DE SALIDA QUE ES EL NOMBRE DEL PAIS
			call.registerOutParameter(2, java.sql.Types.VARCHAR);
			
			//ejecutar el proc almacenado
			call.executeQuery();
			
			//leer valor recuperado
			String NombrePaisRecuperado = call.getString(2);
			
			System.out.printf("nombre del pais %s es %s. " , codigo, NombrePaisRecuperado);
			modificarPaises(con, "AR", "US");
			
			
			String crearTablaProducto = "CREATE TABLE HR.PRODUCTOS "
					+ " (ID_PRODUCTO NUMBER NOT NULL ENABLE PRIMARY KEY, "
					+ "	DESCRIPCION VARCHAR2(50 BYTE) NOT NULL ENABLE, "
					+ "	PRECIO NUMBER DEFAULT 0 NOT NULL ENABLE, "
					+ "	STOCK NUMBER DEFAULT 0 NOT NULL ENABLE)";
			//con.createStatement().execute(crearTablaProducto);
			
			String insertProductos = "INSERT INTO HR.PRODUCTOS "
					+ "(ID_PRODUCTO, DESCRIPCION, PRECIO, STOCK) "
					+ " VALUES (1, 'Television', 1522.5, 8)"; 
			String insertProductos2 = "INSERT INTO HR.PRODUCTOS "
					+ "(ID_PRODUCTO, DESCRIPCION, PRECIO, STOCK) "
					+ " VALUES (2, 'DVD', 25.6, 20)";	
//			con.createStatement().execute(insertProductos);
//			con.createStatement().execute(insertProductos2);
			
			
		} 
		catch (SQLException e) 
		{
			System.out.println("Error BD " + e.getMessage());
			e.printStackTrace();

		}
		
	}
	
	public static void modificarPaises(Connection conexion, String... codigos ) 
	{
		//Crear un contexto transaccional
		//en el que se ejecutan como todo varias sentencias sql
		//si una falla deben fallar todas
		
		try 
		{
			conexion.setAutoCommit(false);
			String modifPais = "UPDATE HR.COUNTRIES "
					+ " SET COUNTRY_NAME = COUNTRY_NAME " + " || 'paadeltas '"
					+ " WHERE COUNTRY_ID = ?";
			PreparedStatement ps = conexion.prepareStatement(modifPais);
			
			for(String codigo: codigos) {
				ps.setString(1, codigo);
				ps.executeUpdate();
			}
			
			conexion.commit();
		}
		catch(SQLException e) 
		{
			System.out.println(e.getMessage());
			try 
			{
				conexion.rollback();
			}
			catch(SQLException e1) 
			{
				e1.printStackTrace();
			}
		}
		
	}
}




