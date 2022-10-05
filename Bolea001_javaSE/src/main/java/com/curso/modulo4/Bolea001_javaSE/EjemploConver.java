package com.curso.modulo4.Bolea001_javaSE;

public class EjemploConver {

	public static void main(String[] args) {
		// 8 tipos primitivos
		
		//entero
		byte a =1; // 8 bits   ....de -129 a 127
		short b = 1; // 16 bits
		int c = 11; //32 bits
		long l = 11; //64 bits
		
		//literales enteros
		int numero = 1; //literal de tipo int y ocupa 32 bits
		long n2 = 1; //literal emterp de 32 bits cabe en un long de 64 bits
		long n3 = 1L; // literal long que ocupa 64 y cabe 64 bits
		//int n4 = 1L; //error
		
		//casting enteros
		int x = 2;
		long y = x; // cabe, hace un casting implicito
		
		long z = 555555555555L;
		int zz = (int)z;// casting explicito
						// jvm mete la tijera y corta los 32 primeros bits de los 64 exstentes
		
		System.out.println(z);
		System.out.println(zz);
		
		
		//decimales
		float f = 45.5f;		//32 bits		//literal float 1.0f (f o F)
		double d = 333.0;	//64 bits		//literal double 1.0
		
		
		//caracter
		char letra= 'x';			//64bits
		char letra2 = '\u03A6';
		System.out.println(letra2);
		int valor = letra;
		System.out.println(letra);
		System.out.println((char)(++valor));
		

	}

}
