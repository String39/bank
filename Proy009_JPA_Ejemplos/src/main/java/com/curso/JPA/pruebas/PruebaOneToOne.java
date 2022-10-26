package com.curso.JPA.pruebas;

import java.awt.Cursor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.curso.JPA.entidades.Customer;
import com.curso.JPA.entidades.Record;

public class PruebaOneToOne {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("OracleHRPU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//Crear un record
		//Crear un cliente que tenga ese record
		//Buscar el cliente creado
		//Mostrar sus datos y los del record
		Record re = new Record(null,"REC_UNO");
		em.persist(re);
		
		Customer c = new Customer(null, "CARLOS GARCIA", re);
		em.persist(c);
		
		int id = c.getId();
		em.getTransaction().commit();
		System.out.println("Buscar el empleado cuyo id es: " + id);
		//em.clear();
		Customer encontrado = em.find(Customer.class, id);
		if(encontrado!=null) {
			System.out.printf("El cliente %s tiene el record %s" ,
			encontrado.getCustomerName(),
			encontrado.getRecord().getName());
		}
		else 
		{
			System.out.println("Cliente no encontrado");
		}
		
	}

}
