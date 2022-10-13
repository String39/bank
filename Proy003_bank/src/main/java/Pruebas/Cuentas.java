package Pruebas;

import com.bank.bank.Account;
import com.bank.bank.OverdraftException;

public class Cuentas {

	public static void main(String[] args) 
	{
		Account a = new Account(300);
		
		//ingresar dinero
		System.out.println("Saldo actual es: " +a.getBalance());
		System.out.println("Ingreso 150");
		try {
			System.out.println("Saldo actual es:" + a.deposito(150));
		} catch (OverdraftException e) {
			e.printStackTrace();
		}
		System.out.printf("%n");
		
		//retirar dinero
		System.out.println("Saldo actual es:" + a.getBalance());
		System.out.println("Retiro 55");
		try {
			System.out.println("Saldo actual es:" + a.retirar(55));
		} catch (OverdraftException e) {
			e.printStackTrace();
		}
		System.out.printf("%n");
		
		//retirar dinero insuficiente
		System.out.println("Saldo actual es: " +a.getBalance());
		System.out.println("Retiro 600");
		try {
			System.out.println("Saldo actual es:" + a.retirar(600));
		} catch (OverdraftException e) {
			e.printStackTrace();
		}
		
	}

}
