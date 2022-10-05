package com.curso.modulo4.Bolea001_javaSE;

public class EjemploAmbitos {
	// var referencia
		String s = "hola";
		
	//variables por su ambito
	//var local
		// declarada como argumento de un metodo o constructor
		// declarada dentro de un metodo o dentro de un bloque de cod
	//var instancia
		//atributo de la clase
	//var de clase (static)
		//atributos declarados como estaticos, durante toda la aplicacion
		
		
		double pm= Producto.PRECIO_MINIMO;
		
	
		Producto p = new Producto(1,"lapiz");
		//RAM en la memoria de pila una variable p
		//RAM en la memoria dinamica(heap) tengo un obj producto con 3 atributos o var instancia (id, descrp, precio)
		
		Producto p2 = new Producto(2,"zapato");
		
}
