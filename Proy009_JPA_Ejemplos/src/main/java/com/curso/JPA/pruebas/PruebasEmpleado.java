package com.curso.JPA.pruebas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.curso.JPA.entidades.Empleado;

public class PruebasEmpleado {
	
	public static void main(String[] args) {
		
		//1. Crear factoria Em
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("OracleHRPU");

		//2. Crear un Em
		EntityManager em = factory.createEntityManager();

		//3. Crear una transaccion
		
		try {
			em.getTransaction().begin();
			Empleado e = new Empleado();
			e.setNombre("LUis");
			e.setApellidos("Garcia");
			e.setFechaContratacion(new java.util.Date());
			e.setIdDepartamento(10);
			e.setIdTrabajo("ST_MAN");
			e.setEmail("fff@gg.es");
			em.persist(e);
			
			System.out.println("Creo un empleado. NUevo id " + e.getId());
			em.getTransaction().commit();
			
		} 
		catch (Exception e1) 
		{
			em.getTransaction().rollback();
		}	
	}
}
