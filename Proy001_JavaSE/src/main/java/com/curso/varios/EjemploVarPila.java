package com.curso.varios;

public class EjemploVarPila {

	public static void main(String[] args) 
	{
		int a = 2;
		metodo1(a);
		System.out.println("fin main");
	
	}
	
	public static void metodo1(int num) 
	{
		int b = num;
		metodo2();
//		String s = null;
//		s = s.toUpperCase();
		System.out.println("fin m1");
	}
	
	public static void metodo2() 
	{
		int c = 3;
		if(c==3) {
			throw new RuntimeException("La has liado");
		}
//		String s = null;
//		s = s.toUpperCase();
		System.out.println("fin m2");
	}
	
	
}
