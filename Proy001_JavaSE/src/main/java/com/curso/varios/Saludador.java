package com.curso.varios;

/*
 JVM cargar la clase com.curso.varios.Saludador 
 (full Qualified name
 */
public class Saludador {

	//atributos
	private String saludo;
	
	//constructores
	public Saludador() {
		//super();
		this.saludo = "Hola";
	}
	public Saludador(String saludo) {
		this.saludo = saludo;
	}
	
	// métodos

	public String saluda(String nombreUsuario) {
		//return "Hola" + nombreUsuario;
		return this.saludo + nombreUsuario;
	}
	
	//sobrecargar el metodo con distintos tipos de 
	//argumentos
	public String saluda() {
		return "Hola Amigo";
	}
}
