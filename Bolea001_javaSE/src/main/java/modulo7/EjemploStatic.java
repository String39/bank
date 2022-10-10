package modulo7;

public class EjemploStatic {
	
	private static int revision;
	private int numero;
	
	private static void hazAlgo() {
		
	}
	
	public static class ClaseInterna{
		private int no;
	}
	
	public static void main(String[] args) {
		/*
		 * La variable estatica revision se crea la primera vez
		 * que se carga la clase EjemploStatic y solo hay una 
		 * para toda la app
		 */
		EjemploStatic.revision = 3;
		
		//No tiene e atributo revision por ser estatico, en este caso solo tendria numero
		EjemploStatic c = new EjemploStatic();
	}
}
