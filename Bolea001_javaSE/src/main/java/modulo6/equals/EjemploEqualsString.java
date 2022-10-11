package modulo6.equals;

public class EjemploEqualsString {
	
	public static void main(String[] args) {
		String s = "Hola";   //new String("Hola");
		String p = "Hola";
		
		System.out.println("p == s " + (p==s));
		//"Hola" se crea un obj String "hola" en Pool String
		//s y p apuntan al mismo "Hola"
		
		String x = new String("Hola");
		System.out.println("p == x " + (p==x));
		
		//STRING CLASE INMUTABLE
		s = "Hola";
		s= s.toUpperCase();
		System.out.println(s);
	}

}
