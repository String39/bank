package com.flota.dominio;

public class Pajaro implements Volable{

	@Override
	public void despegar() {
		System.out.println("Despego desde lo alto");
	}

	@Override
	public void aterrizar() {
		System.out.println("aterrizo como un pajaro");
	}

	@Override
	public void volar() {
		System.out.println("VUELO batiendo las alas");
	}

}
