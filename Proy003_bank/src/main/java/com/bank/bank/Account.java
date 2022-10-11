package com.bank.bank;

public class Account 
{
	protected double balance;
	
	public Account(double balanceinicial) 
	{
		if(balanceinicial>0) {
			this.balance= balanceinicial;

		}
	}

	public double getBalance() {
		return balance;
	}
	
	public double deposito (double cantidad) 
	{
		if(balance >0) {
			balance = balance + cantidad;
			//throw new RuntimeException("Saldo Negativo");
		}
		else {
			System.out.println("NO se puede ingresar dinero negativo");
		}
		return balance;
	}
	
	public double retirar (double cantidad) 
	{
		if(cantidad <=0) {
			System.out.println("Introducir cantidad mayor que 0");
		} 
		
		if(balance >= cantidad) 
		{
			//throw new RuntimeException("Saldo insuficiente");
			//return false;
			balance = balance -cantidad;
		}
		else 
		{
			System.out.println("Saldo insuficiente");
		}
		return balance;
	}
}
