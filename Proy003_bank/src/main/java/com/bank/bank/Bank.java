package com.bank.bank;

public class Bank 
{
	private static Customer[] customers;
	private static int numberOfCustomers;
	
//	public Bank() 
//	{
//		customers = new Customer[7];
//		numberOfCustomers = 0;	
//	}
	static {
		customers = new Customer[7];
		numberOfCustomers = 0;	
	}
	
	public void añadir(String f, String l) {
		int i = numberOfCustomers++;
		Customer c = new Customer(f, l);
		customers[i]= c;
	}
	
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	
	public Customer getCustomer(int i) {
		return customers[i];
	}
	
//	public void generarInforme () {
//		System.out.println("INFORME CLIENTES");
//		System.out.println("----------------");
//		
//		for (int i=0; i<getNumberOfCustomers(); i++) {
//			Customer c = getCustomer(i);
//		}
//	}
	
}
