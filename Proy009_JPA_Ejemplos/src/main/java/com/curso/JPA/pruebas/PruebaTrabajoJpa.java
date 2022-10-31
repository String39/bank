package com.curso.JPA.pruebas;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.curso.JPA.entidades.Trabajo;

public class PruebaTrabajoJpa {
	public static void main(String[] args) {
		
		//1. Crear una factoria de Entity Manager
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("OracleHRPU");
		
		//2. Obtenemos un Entity Manager
		//conecta con HR de Oracle y Mapea las clases entidad
		EntityManager em = factory.createEntityManager();
		
		//3. obtener el tranbajo con un  id "AD_VP"
		Trabajo t = em.find(Trabajo.class, "AD_VP");
		if(t == null) 
		{
			System.out.println("No existe el trabajo AD_VP");
		}
		else 
		{
			System.out.println(t);
		}
		System.out.println(t);
		
		//4. Crear un nuevo Trabajo
//		Trabajo tNuevo = new Trabajo("BE_OL", "Tareas Super Dificiles", 233000.0, 500000.0);
//		
//		//inicia una nueva transaccion
//		em.getTransaction().begin();
//		em.persist(tNuevo); //insert
//		//Obtiene la transaccion y la confirma
//		em.getTransaction().commit();
		
		
		//5.MOdificacion
		
		Trabajo tNuevoModificado = new Trabajo("BE_OL", "Tareas Super Dificiles de verdad", 233000.0, 500000.0);
			//5.1 Modificar despues de un find
			try 
			{
				em.getTransaction().begin();
				Trabajo tDesdeBD = em.find(Trabajo.class, tNuevoModificado.getId());
				tDesdeBD.setTituloTrabajo(tNuevoModificado.getTituloTrabajo());
				em.getTransaction().commit();
			} 
			catch (Exception e) 
			{
				em.getTransaction().rollback();			
			}
			
			//5.2 Usando el metodo em.merge
			Trabajo otraVezTrabajoModif = new Trabajo("BE_OL", "Tareas Superrrrr de verdad", 153000.0, 550000.0);

				em.getTransaction().begin();
				System.out.println("...merge");
				Trabajo trabajoEnBd = em.merge(otraVezTrabajoModif);
				System.out.println("... despues de merge");

				
				//otraVezTrabajoModfi no esta attached contra la bd
				otraVezTrabajoModif.setTituloTrabajo("sdsjgkasg2");
				
				trabajoEnBd.setTituloTrabajo("este si esta attached");
				System.out.println("...antes de commit");

				
				em.getTransaction().commit(); //update
				System.out.println("...despues de commit");
				
			//6. Borrar
				em.getTransaction().begin();
				Trabajo tBorrar = new Trabajo(); //No esta sincronicazdo
				tBorrar.setId("BE_OL");

				//find del obj
				Trabajo tBD = em.find(Trabajo.class, tBorrar.getId());
				//tBd si esta sincronizado
				
				//remove
				em.remove(tBD);
				em.getTransaction().commit(); 
				
			//7. CONSULTA JPAQUERY
																//Nombre de la clase
				Query consulta = em.createQuery("SELECT t FROM Trabajo t");
				List <Trabajo> lista = consulta.getResultList();
				for(Trabajo trabajo:lista) {
					System.out.println(trabajo);
				}

	}
}
