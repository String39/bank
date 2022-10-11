package modulo6;

import modulo5.Punto;

public class EjemploArgVariable {
	
	private static int suma(int n, int nn, int nnn) {
		return n +nn+ nnn;
	}
	
	private static int suma(int n, int nn) {
		return n +nn;
	}
	
	private static int suma ( int... numeros) { //numero variable
		int r =0;
		for (int i:numeros) {
			r+=i;
		}
		return r;
	}
	
	private void opera(String tipo, Punto... datos) {
		
	} //puede a ver varios argumentos pero argumentos variables solo uno y tiene que
	// ser al final de los argumentos
	
	public static void main(String[] args) {
		suma (2,2,3); //A primero
		suma(2,4); 		//A segundo
		
		int[] num = {4,5,6,8};
		suma(num);
		
		suma(23,3,4,233,56,5,25,64);
	}

}
