package colecciones;

import java.util.*;


public class EjemploClaseUtilidadCollections {

	public static void main(String[] args) {
		Set<Integer> valores = new HashSet();
		valores.add(25);
		valores.add(2);
		valores.add(34);
		valores.add(54);
		valores.add(22);
		valores.add(12);
		
		for(Integer i:valores) {
			System.out.println(i);
		}
		
		
		
	}

}
