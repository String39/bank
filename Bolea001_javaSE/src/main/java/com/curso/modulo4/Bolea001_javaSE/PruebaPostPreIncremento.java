package com.curso.modulo4.Bolea001_javaSE;

public class PruebaPostPreIncremento {

	public static void main(String[] args) 
	{
		int a=1;
		int b= a++;
		//int b= ++a;
		System.out.println(a);
		System.out.println(b);
		
		if(a++ >2) {
			System.out.println("estoy aqui");
		}
	}

}
