package com.curso.mercado.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.curso.mercado.entidades.Producto;

public class ProductoJPADAO implements GenericDAO<Producto> 
{
	
	private static EntityManagerFactory factory;

	static {
		factory = Persistence.createEntityManagerFactory("OracleHRPU");	
	}
	@Override
	public void add(Producto p) {
		EntityManager em = factory.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(p);
			System.out.println("Producto añadido");
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("NO se ha podido añadir");
			em.getTransaction().rollback();
		}
	}

	@Override
	public List<Producto> getAll() {
		EntityManager em = factory.createEntityManager();
			Query consulta = em.createQuery("SELECT p FROM Producto p");
			List<Producto> lista = consulta.getResultList();
			return lista;
	}

	@Override
	public Producto getByID(int id) {
		EntityManager em = factory.createEntityManager();
		Producto p =em.find(Producto.class, id);
		if(p!=null) {
			return p;
		}
		return null;
		
	}

	@Override
	public void delete(int id) {
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Producto p =em.find(Producto.class, id);
		if(p!=null) {
			em.remove(p);
		}
		
	}

	@Override
	public void update(Producto entidad) {
		
	}

}
