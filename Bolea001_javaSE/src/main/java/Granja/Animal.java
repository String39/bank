package Granja;

public class Animal {
	private String sonido;
	
	public void comer() {
		System.out.println("Estoy comiendo.....");
	}
	
//	public static void main(String[] args) {
//		Gato g = new Gato();
////		g = new Perro(); /// NO
////		g = new Animal(); /// NO porque Animal es padre
//
//		Animal a = new Perro(); //service.getAnimal(2);
//		Perro p = new Perro();
//		
//		//POLIMORFISMO
//		PerroCaza p2 = new PerroCaza();
//		a = p2;  //Animal
//		p=p2;	//PerroCaza
//		
//		if(p instanceof PerroCaza) {
//			PerroCaza caza = (PerroCaza)p;
//			caza.olfatear();
//		}
//	}
}

class Perro extends Animal{
	private String raza;
	
	@Override
	public void comer() {
		System.out.println("Como huesos o pienso");
	}
}

class PerroCaza extends Perro{
	private int altura;
	
	public void olfatear() {
		System.out.println("Oliendo a la presa!!!");
	}
	@Override
	public void comer() {
		System.out.println("Como lo que he cazado");
	}
}

class Gato extends Animal{
	@Override
	public void comer() {
		System.out.println("Como ratones");
	}
}

class Vaca extends Animal{
	@Override
	public void comer() {
		System.out.println("Como hierbas");
	}
}

