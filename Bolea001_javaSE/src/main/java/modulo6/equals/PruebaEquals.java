package modulo6.equals;

public class PruebaEquals {

	public static void main(String[] args) {
		
		//comparacion entre tipos primitivos
		int a = 500;
		int b = 500;
		System.out.println("a == b " + (a==b));
		
		//comparacion entre obj
		Cliente c =new Cliente(1,"Laura");
		Cliente c1 =new Cliente(1,"Laura");
		//System.out.println("c == c1 " + (c==c1)); 
		/*
		 * Cliente extiende de Object
		 * y como no sobreescribe equals()
		 * usa ==
		 */
		System.out.println("c equals c1 " + (c.equals(c1)));
		}
	
	 

}
