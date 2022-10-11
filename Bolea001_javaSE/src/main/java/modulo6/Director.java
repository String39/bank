package modulo6;

import java.util.Date;

public class Director extends Gerente{
	
	private double vehiculoEmpresa;
	
	public Director(String nombre, double salario, Date fNac, String departamento) {
		super(nombre, salario, fNac, departamento);
		this.vehiculoEmpresa = 0.0;	
		}

	public double getVehiculoEmpresa() {
		return vehiculoEmpresa;
	}

	public void setVehiculoEmpresa(double vehiculoEmpresa) {
		this.vehiculoEmpresa = vehiculoEmpresa;
	}

	public void aumentarComision() {
		
	}
	
	@Override
	public String getDetails() {
		return "Nombre" + getNombre() + "Con salario: " + getSalario() + "Es el gerente del:" + getDepartamento() + "y tiene como vehiculo" + getVehiculoEmpresa();
	}

}
