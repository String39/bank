package com.curso;

import java.util.Collection;
import java.util.List;

public class Bank {
  private static Customer[] customers;
  private static int        numberOfCustomers;

  static {
    customers = new Customer[7];
    numberOfCustomers = 0;
//    customers[0]= new Customer("Pedro","Garcia");
//    customers[0]= new Customer("Lucas","Perez"); 
//    customers[0]= new Customer("Juan","dsfas"); 
//    customers[0]= new Customer("David","dfdf"); 
//    customers[0]= new Customer("Javi","JJJJ"); 
//    customers[0]= new Customer("MMMM","GFGFGF"); 
    Bank.addCustomer("Pedro", "GGGG");
    Customer customer = Bank.getCustomer(0);
    customer.addAccount(new SavingsAccount(500.00, 0.05));
    customer.addAccount(new CheckingAccount(200.00, 500.00));
    Bank.addCustomer("Carlos", "Bryant");
    customer = Bank.getCustomer(1);
    customer.addAccount(new SavingsAccount(200.00, 0.03));
  }

  private Bank() {
    // this constructor should never be called
  }

  public static void addCustomer(String f, String l) {
    int i = numberOfCustomers++;
    customers[i] = new Customer(f, l);
  }
  public static int getNumOfCustomers() {
    return numberOfCustomers;
  }
  public static Customer getCustomer(int customer_index) {
    return customers[customer_index];
 }
 
  public static Customer[] getAll() {
	  return customers;
  }
}
