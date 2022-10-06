package Pruebas;

import com.bank.bank.Bank;
import com.bank.bank.Customer;

public class PruebasBank {

	public static void main(String[] args) 
	{

		Bank b = new Bank();
		b.añadir("Lucas", "Garcia");
		b.añadir("Pe", "fgs");
		b.añadir("LUIS", "Garcia");
		
		for(int i = 0 ; i< b.getNumberOfCustomers(); i++) 
		{
			Customer c = b.getCustomer(i);
 			System.out.println("Cliente ["+ (i+1) + "] es " + c.getNombre() + " " +c.getApellidos());
		}
		
	}

}
