package modulo6;

import java.util.Date;

public class Administrativo extends Empleado{
	
	private int id;

	public Administrativo(String nombre, double salario, Date fechaNacimiento) {
		super(nombre, salario, fechaNacimiento);
		this.id = 32;
	}
	
}
