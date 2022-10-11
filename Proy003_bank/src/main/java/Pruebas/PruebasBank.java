package Pruebas;

import com.bank.bank.Account;
import com.bank.bank.Bank;
import com.bank.bank.Customer;
import com.bank.bank.SavingAccount;

public class PruebasBank {

	public static void main(String[] args) 
	{

		Bank b = new Bank();
		Customer c;
		Account a;
		
		 	System.out.println("Creating the customer Jane Smith.");
		    b.añadir("Jane", "Simms");
		    c = b.getCustomer(0);
		    System.out.println("Creating her Savings Account with a 500.00 balance and 3% interest.");
		    c.setAccount(new SavingAccount(500.00, 0.03));
		
		    System.out.println("Creating the customer Jane Smith.");
		    b.añadir("Owen", "Bryant");
		    c = b.getCustomer(1);
		    System.out.println("Creating her Savings Account with a 500.00 balance and 3% interest.");
		    c.setAccount(new SavingAccount(500.00, 0.03));
		    
//		    System.out.println("Retrieving the customer Jane Smith with her savings account.");
//		    c = b.getCustomer(0);
//		    a = c.getAccount(1);
//		    // Perform some account transactions
//		    System.out.println("Withdraw 150.00: " + a.retirar(150.00));
//		    System.out.println("Deposit 22.50: " + a.deposito(22.50));
//		    System.out.println("Withdraw 47.62: " + a.retirar(47.62));
//		    System.out.println("Withdraw 400.00: " + a.deposito(400.00));
//		    // Print out the final account balance
//		    System.out.println("Customer [" + c.getNombre()
//				       + ", " + c.getApellidos()
//				       + "] has a balance of " + a.getBalance());
//		    System.out.println();
		    
		for(int i = 0 ; i< b.getNumberOfCustomers(); i++) 
		{
			Customer cl = b.getCustomer(i);
 			System.out.println("Cliente ["+ (i+1) + "] es " + cl.getNombre() + " " +cl.getApellidos());
		}
		
	}

}
