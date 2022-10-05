package com.curso.modulo4.Bolea001_javaSE;

public class Producto 
{
	//atributos
	//variables de instancia
	private int id;
	private String descrip;
	private double precio;
	
	//variable de clase
	//static  --variable de clase 
	//final - constante
	public static final double PRECIO_MINIMO = 1.2;
	
	//var local s, cuando acabo el metodo
	//var local inicializar
	public Producto(String s) {
		this.descrip = s;
		this.precio= PRECIO_MINIMO;
	}
	
	public void increPrecio() {
		int incremento = 5;
		this.precio+= incremento/200;
	}
	
	public void hacerCalculo() {
		int x = (int)(Math.random() * 100);
		int y = 0;
		int z;
		if (x > 50) {
		y = 9;
		}
		z = y + x; // Posible uso antes de inicialización
		}

}
