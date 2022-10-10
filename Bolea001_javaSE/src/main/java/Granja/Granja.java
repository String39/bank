package Granja;

public class Granja {
	
	public void alimentarAnimales(Animal [] lista) {
		for(Animal a: lista) {
			if(a instanceof PerroCaza) {
				((PerroCaza)a).olfatear();
			}
			a.comer();
		}
	}
	
	public static void main(String[] args) {
		Animal[] animales = {
				new Perro(),
				new Gato(),
				new Perro(),
				new PerroCaza(),
				new Vaca()
		};
		
		Granja g = new Granja();
		g.alimentarAnimales(animales);
	}
	
}
