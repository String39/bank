package com.curso.pruebas;

import com.curso.varios.Saludador;

public class PruebasSaludador {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		// Uso de la clase saludador
//		int numeroCamiones=2;
//		
//		//1. Se puede crear un objeto Saludador
//		Saludador s1 = new Saludador();
//		//s1 variable de ref que apunta a objetos de clase Saludador
//		// Saludador s1 -> com.curso.varios.Saludador
//		
//		//2. Pedir saludar pasando nombre -> muestra "Hola" + Nombre
//		//syso + ctrl + espacio
//		System.out.println(s1.saluda(" David"));
//				
//		//3. Pedir saludar sin nombre -> muestra "Hola Amigo"
//		System.out.println(s1.saluda());
//				
//		//4. Crear un saludador en el que indice el saludo
//		Saludador s2 = new Saludador("Buenos dias");
//		
//		//5. Pedir saludo sin nombre "Buenos dias Amigo"
//		System.out.println(s2.saluda(" David"));
//				
//	}
	public static void main(String[] args) {
		int[][] arr = new int[2][4];
		arr[0] = new int[]{1,3,5,7};
		arr[1] = new int[]{1,3};
		for(int[] a: arr){
		for(int i : a){
		System.out.print(i + " ");
		}
		System.out.println();
		}
		}

}
