package Pruebas;

import com.bank.bank.Account;
import com.bank.bank.Customer;
import com.bank.bank.OverdraftException;

public class Cliente {

	public static void main(String[] args) 
	{
		Customer c = new Customer("Carlos", "Garcia");
		Customer c1 = new Customer("Fdez", "Luis");
				
		System.out.println("Datos del Cliente");
		System.out.println("-----------------");
		System.out.println("Nombre: " + c.getNombre()); 
		System.out.println("Apellidos: " + c.getApellidos());
		System.out.println("Tiene un saldo de: " + c.getAccount(0).getBalance());
		
		//ingreso
		System.out.println("Ingreso la cantidad de 300");
		try {
			c.getAccount(0).deposito(300);
		} catch (OverdraftException e) {
			e.printStackTrace();
		}
		//sacar
		System.out.println("Saco 150");
		try {
			c.getAccount(0).retirar(150);
		} catch (OverdraftException e) {
			e.printStackTrace();
		}
		System.out.println("El saldo actual es:" + c.getAccount(0).getBalance());
		
	}

}
