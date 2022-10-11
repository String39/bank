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
		    
		for(int i = 0 ; i< b.getNumberOfCustomers(); i++) 
		{
			Customer cl = b.getCustomer(i);
 			System.out.println("Cliente ["+ (i+1) + "] es " + cl.getNombre() + " " +cl.getApellidos());
		}
		
	}

}
