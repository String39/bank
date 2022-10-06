package modulo5;

public class EjemploArrayEnteros {

	public static void main(String[] args) 
	{
		int [] numeros;  //declarando un array de enteros
		numeros = new int[4]; //Creo array de enteros iniciliazidos a 0
		
		numeros[0]=7;
		//numeros[4]=8; //error java.lang.ArrayIndexOutOfBoundsException:
		for(int n: numeros) {
			System.out.println(n);
		}
		
		//declarar e inicializar
		int[] cantidades = {1,25,34,54};
		
		int[] c;
		c = new int[] {2,3,0};

	}

}
