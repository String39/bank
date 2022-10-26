package com.curso.JPA.pruebas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.curso.JPA.entidades.Customer;
import com.curso.JPA.entidades.Order;

public class PruebaOneToMany {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("OracleHRPU");
		EntityManager em = factory.createEntityManager();
		
		//crear un pedido para un cliente (id4)
//		Order pedido = new Order();
//		Customer c = new Customer();
//		c.setId(4);
//		pedido.setCliente(c);
//		pedido.setDescripcion("Pedido super");
//		
//		em.getTransaction().begin();
//		em.persist(pedido);
//		em.getTransaction().commit();
		
		//Buscar el pedido creado que es el 6 y 
		//me trae el cliente
		Order o = em.find(Order.class, 6L);
		System.out.printf("El pedido %s ha sido hecho por %s " , o.getDescripcion(), o.getCliente().getCustomerName() );
	}
}
