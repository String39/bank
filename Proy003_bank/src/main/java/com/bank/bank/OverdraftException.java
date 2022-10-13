package com.bank.bank;

public class OverdraftException extends Exception{
	private double deficit;
	
	public OverdraftException(String mensaje, double deficit) {
		super(mensaje);
		this.deficit = deficit;
	}
	
	public double getDeficit() {
		return deficit;
	}
}
