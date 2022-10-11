package modulo6;

import java.util.Date;

public class Gerente extends Empleado{
	
	//atributos.. todos los del padre empleado y los suyos
	private String departamento;
	
	//Constructores
	public Gerente(String nombre, double salario, Date fNac, String departamento) {
		super(nombre, salario,fNac); //el constructor de la clase Empleado les pasas sus propios atributos
		this.departamento= departamento;
	}
	public Gerente(String nombre, String departamento) {
		super(nombre);
		this.departamento = departamento;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
//	@Override
//	public String getDetails() {
//		return  getNombre() + " Con salario: " + getSalario() + " Es el gerente de: " + getDepartamento();
//	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + " y dirige: " + getDepartamento();
	}
	
	public static void saluda() {
		
	}
}
