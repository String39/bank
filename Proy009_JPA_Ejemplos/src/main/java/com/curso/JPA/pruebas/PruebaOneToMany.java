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
		
		//-----------------------------------------------------------------------
		
		//Buscar el pedido creado que es el 6 y 
		//me trae el cliente
//		System.out.println("Buscando 6................");
//		Order o = em.find(Order.class, 6L);
//		System.out.printf("El pedido %s ha sido hecho por %s " , o.getDescripcion(), o.getCliente().getCustomerName() );
		
//		em.clear();
//		
//		System.out.println("Buscando 6................");
//		Order o1 = em.find(Order.class, 6L);
//		System.out.printf("El pedido %s ha sido hecho por %s " , o1.getDescripcion(), o1.getCliente().getCustomerName() );
		
		System.out.println(".....buscamos cliente 4");
		Customer D = em.find(Customer.class, 4);
		
		System.out.println("El cliente " + D.getCustomerName());
		System.out.println("pedidos: ");
		for(Order or: D.getPedidos()) {
			System.out.println(or.getDescripcion());
		}
		
		
		
	}
}
