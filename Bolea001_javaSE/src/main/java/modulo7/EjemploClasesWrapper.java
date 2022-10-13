package modulo7;

public class EjemploClasesWrapper {
	public static void main(String[] args) {
		int numero = 2;
		Integer numero2 = new Integer(2);
		
		Integer numero3 = 2; //internamente hace un new Integer(2) Obj Integer con valor 2
		
		int a = numero3; //.intValue()
		
		int b = numero3 + new Integer(4);
		
		
		//comparacion del valor de la variable de ref, esto es
		//compara la direcc de memoria ==
		
		//comparacion contenido obj equals
		Integer n1 = 128;
		Integer n2 = 128;
		Integer n3 = new Integer(128);
		
		System.out.println("n1 == n2 " + (n1==n2)); 
		System.out.println("n1 == n3 " + (n1==n3)); 
		
		if(n1.equals(n2)) {
			System.out.println("n1 y n2 son iguales");
		}
		if(n1.equals(n3)) {
			System.out.println("n1 y n3 son iguales");
		}
	}
	
}
