package modulo7;

import java.sql.Connection;

public class EjemploStatic2 {
	public static final String USER_DB = "alfresco";
	public static final String URL_DB = "gassgg";
	
	//No queremos que se instancien obj de la EjemploStatic2
	//se declara el constructor private
	private EjemploStatic2() {
		
	}
	
	public static Connection getConnection() {
		return null;
	}
	
}
