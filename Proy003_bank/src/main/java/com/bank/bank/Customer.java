package com.bank.bank;

public class Customer 
{
	private String Nombre;
	private String Apellidos;
	private Account[] accounts;
	private int numberOfAccounts;
	
	public Customer(String nom, String ape) 
	{
		this.Nombre = nom;
		this.Apellidos = ape;
		this.accounts= new Account[10];
		this.numberOfAccounts = 0;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

//	public Account[] getAccounts() {
//		return accounts;
//	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public void setNumberOfAccounts(int numberOfAccounts) {
		this.numberOfAccounts = numberOfAccounts;
	}

	public Account getAccount(int index) {
		return accounts[index];
	}

	//metodos
	public void addAccount (Account a) {
		int cuenta = numberOfAccounts++;
		accounts[cuenta] = a;
	}
	
	
	
//	public Account getAccount() {
//		return account[10];
//	}
//
//	public void setAccount(Account account) {
//		this.account = account[10];
//	}
//
//	public String getNombre() {
//		return Nombre;
//	}
//
//	public String getApellidos() {
//		return Apellidos;
//	}
	
	
}
