package modulo6;

public class Prueba {
	
	public static void main(String[] args) {
		Empleado e = new Empleado();
		e.setNombre("Luis Ramos");
		e.setSalario(40.000);
		
		Gerente g = new Gerente();
		g.setNombre("Carlos minf");
		g.setDepartamento("Desarrollo");
		g.setSalario(70000);
		
		System.out.println("g es un gerente? " + (g instanceof Gerente));
		System.out.println("g es un empleado? " + (g instanceof Empleado));
		System.out.println("e es un gerente? " + (e instanceof Gerente));
		
		//Una variable de ref puede apuntar a obj de su clase o hijos/as
		
		Empleado Carlos = new Gerente();
		Carlos.setNombre("Carlos Perez");
		Carlos.setSalario(45.000);
		
		//Carlos tiene forma de empleado solo permite acceder a los metodos declarados
		//en la clase empleado, y no puedo acceder a departamento
		
		//Carlos.setDepartamento("...."): ERROR
		
		Carlos = new Empleado();
	}
}
