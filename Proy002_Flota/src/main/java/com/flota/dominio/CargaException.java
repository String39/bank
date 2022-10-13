package com.flota.dominio;

public class CargaException extends Exception
{
	//atributos que quiero informar
	private double excesoCarga;
	
	public CargaException(String mensaje, double excesoCarga) {
		super(mensaje);
		this.excesoCarga = excesoCarga;
	}
	
	public double getExcesoCarga() {
		return excesoCarga;
	}
}
