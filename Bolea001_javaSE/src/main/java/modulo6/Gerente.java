package modulo6;

public class Gerente extends Empleado{
	
	//atributos.. todos los del padre y los suyos
	private String departamento;
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	@Override
	public String getDetails() {
		return "Nombre" + getNombre() + "Con salario: " + getSalario() + "Es el gerente del:" + getDepartamento();
	}
}
