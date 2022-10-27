package com.curso.mercado.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.curso.mercado.entidades.Producto;

public class ProductoJPADAO implements GenericDAO<Producto> {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("OracleHRPU");
	EntityManager em = factory.createEntityManager();
	
	@Override
	public void add(Producto p) {
		em.getTransaction().begin();
		p.setIdProducto(null);
		p.setDescripcion("SUGUS");
		p.setPrecio(10);
		p.setStock(20);
		em.getTransaction().commit();
		System.out.println("Producto creado con id: " + p.getIdProducto());
	}

	@Override
	public List<Producto> getAll() {
		
		try {
			Query consulta = em.createQuery("SELECT * "
					+ " FROM Prodcutos ");
			
			List<Producto> lista = consulta.getResultList();
			
			System.out.println("Lista de departamentos sin manager");
			for (Producto d2: lista) {
				return lista;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public Producto getByID(int id) {
		return null;
	}

	@Override
	public void delete(int id) {
		
	}

	@Override
	public void update(Producto entidad) {
		
	}

}
