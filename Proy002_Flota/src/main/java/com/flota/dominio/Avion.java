package com.flota.dominio;

import java.util.Date;

public class Avion extends Vehiculo implements Volable, Reservable{

	protected Avion(String matricula, double cargaMaxima) {
		super(matricula, cargaMaxima);
	}

	@Override
	public double consumoFuel() {
		return 300.5;
	}

	@Override
	public void despegar() {
		System.out.println("Despego por la pista como un avion");
	}

	@Override
	public void aterrizar() {
		System.out.println("Aterrizo por la pista como un avion");
	}

	@Override
	public void volar() {
		System.out.println("Vuelo como una avion de dos motores");
	}

	@Override
	public void reservar(Date fechareserva) {
		System.out.println("Reservo un vuelo en la fecha " + fechareserva);
	}

}
