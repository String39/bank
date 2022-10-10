package modulo7;

public class PruebaCounter {
	//pruebas
		public static void main(String[] args) {
			//System.out.println(Counter.counter);
			System.out.printf("counter vale %d %n ", Counter.getCounter());
			
			//crear 3 objetos counter
			Counter c = new Counter();
			Counter c1 = new Counter();
			
			//Counter.counter= 9;
			Counter c2 = new Counter();
			
			//ver sus serial numbers
			//y ver lo que vale ahora
			System.out.printf("Counter c vale %d %n",c.getSerialNumber());
			System.out.printf("Counter c1 vale %d %n",c1.getSerialNumber());
			System.out.printf("Counter c2 vale %d %n",c2.getSerialNumber());
			System.out.printf("counter vale ahora %d %n", Counter.getCounter());
		}
}
