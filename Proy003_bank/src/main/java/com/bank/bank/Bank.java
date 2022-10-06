package com.bank.bank;

public class Bank 
{
	private Customer[] customers;
	private int numberOfCustomers;
	
	public Bank() 
	{
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
	
}
