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
	
	public double deposito (double cantidad) throws OverdraftException 
	{
		if(balance >0) {
			balance = balance + cantidad;
			//throw new RuntimeException("Saldo Negativo");
		}
		else {
			throw new OverdraftException("NO se puede ingresar dinero negativo", 0);
			//System.out.println("NO se puede ingresar dinero negativo");
		}
		return balance;
	}
	
	public double retirar (double cantidad) throws OverdraftException 
	{
		if(cantidad <=0) {
			throw new OverdraftException("Introducir cantidad", 0);
			//System.out.println("Introducir cantidad mayor que 0");
		} 
		
		if(balance >= cantidad) 
		{
			//throw new RuntimeException("Saldo insuficiente");
			//return false;
			balance = balance -cantidad;
		}
		else 
		{
			throw new OverdraftException("Saldo insuficiente", 0);
			//System.out.println("Saldo insuficiente");
		}
		return balance;
	}
}
