package modulo6;

import java.util.Date;

public class Prueba {
	
	public static void main(String[] args) {
		Empleado e = new Empleado("Luis");
		e.setNombre("Luis Ramos");
		e.setSalario(40000.0);
//		
		Gerente g = new Gerente("LUis","i");
		g.setNombre("Carlos minf");
		g.setDepartamento("Desarrollo");
		g.setSalario(70000.0);
//		
//		//System.out.println(e.getDetails());
//		System.out.println(g.getDetails());
//		
//		Administrativo a = new Administrativo();
//		a.setNombre("Roberto");
//		a.setSalario(15000.0);
//		System.out.println(a.getDetails());
//		
////		System.out.println("g es un gerente? " + (g instanceof Gerente));
////		System.out.println("g es un empleado? " + (g instanceof Empleado));
////		System.out.println("e es un gerente? " + (e instanceof Gerente));
////		
////		//Una variable de ref puede apuntar a obj de su clase o hijos/as
////		
////		Empleado Carlos = new Gerente();
////		Carlos.setNombre("Carlos Perez");
////		Carlos.setSalario(45.000);
////		
////		//Carlos tiene forma de empleado solo permite acceder a los metodos declarados
////		//en la clase empleado, y no puedo acceder a departamento
////		
////		//Carlos.setDepartamento("...."): ERROR
////		
////		Carlos = new Empleado();
//		
////		Empleado e22 = new Gerente();
////		e22.setNombre("Rosa");
////		System.out.println(e22.getDetails());
////		e22.saluda(); //no estamos sobrecargando, ejecuta metodo estatico de
////						// empleado, es decir, mira l tipo de la variable de ref
////		Empleado.saluda();
////		Gerente.saluda();
//		
		Gerente e22 = null;
		if(e22 instanceof Gerente) {
			e22= (Gerente)e22;
	}
		
		Empleado mario = new Empleado("Mario", 14000.0, new Date());
		Gerente ge = new Gerente("BEgo",45000.0, new Date(), "Desarrollo");
		System.out.println(mario.getClass());
		System.out.println(mario.toString()); //direc de memoria
	}
}
