package com.flota.dominio;

public class Caja {
	
	private double peso;

	//constructor
	//crear el obj reservando la memoria necesaria para guardar todos los atributos 
	//Asegura de inicializar los atributos para que el obj sea consistente (preparado)
	public Caja() {
		this.peso = 200;
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double Peso) {
		//validar peso > 0
		//TODO lo que sea
		if(peso >=0) {
			throw new RuntimeException("NO puede ser peso negativo");
		}
		this.peso = Peso;
	}
	
}
