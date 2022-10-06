package modulo5;

public class EjemploArrayObjetosPunto {

	public static void main(String[] args) 
	{
		Punto[] figura;
		figura = new Punto[3];
		figura[0]=new Punto(3,4);
		
		for(Punto p:figura) {
			System.out.println(p);
		}
		
		//array de 3 puntos
		Punto[] triangulo = {
				new Punto(2,3),
				new Punto(4,8),
				new Punto(7,5),
		};
		System.out.println("triangulo.....");
		for (Punto p:triangulo) {
			System.out.println(p);
		}
	}

}
