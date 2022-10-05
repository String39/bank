package com.bank.bank;

public class Customer 
{
	private String Nombre;
	private String Apellidos;
	private Account account;
	
	public Customer(String nom, String ape) 
	{
		this.Nombre = nom;
		this.Apellidos = ape;
		this.account= new Account(0);
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getNombre() {
		return Nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}
	
	
}
