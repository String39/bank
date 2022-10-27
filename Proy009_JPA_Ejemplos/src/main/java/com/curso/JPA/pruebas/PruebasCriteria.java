package com.curso.JPA.pruebas;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.curso.JPA.entidades.Departamento;
import com.curso.JPA.entidades.Empleado;

public class PruebasCriteria {

	public static void main(String[] args) {
		
		//1. Usando criteriaBuilder
		//2. obtener todos los departamentos
		// por localidad or manager
		//condicion de localidad y manager es opcional
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("OracleHRPU");
		EntityManager em = factory.createEntityManager();
		
		Integer localidad= null;
		Integer idmanager = null;
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Departamento> cq = cb.createQuery(Departamento.class);
		
		Root<Departamento> depart = cq.from(Departamento.class);
		
		//List<Predicate> condiciones = new ArrayList<>();
		Predicate loc = null;
		Predicate man = null;
		Predicate fin = null;
		
		if(localidad!=null) {
			loc =(cb.equal(depart.get("idLocalidad"),localidad));
		}
		if(idmanager!=null) {
			man =(cb.equal(depart.get("manager_id"), idmanager));
		}
		
		if(loc!= null && man !=null) 
		{
			fin = cb.or(loc,man);
		}
		else if (loc!=null) 
		{
			fin = loc;
		}
		else if(man!=null)
		{
			fin = man;
		}
		
//		Predicate And = cb.and(condiciones.toArray(new Predicate[0]));
//		Predicate or = cb.equal(depart.get("manager_id"), idmanager);
//		Predicate fin = cb.or(And, or);
//		cq.where(fin);
		
		if(fin !=null) {
			cq.where(fin);
		}
		
		//ORDER BY
		cq.orderBy(cb.asc(depart.get("nombreDepartamento"))); //ascendente
		cq.orderBy(cb.desc(depart.get("nombreDepartamento"))); //descendente
		
		Query qCriteria  = em.createQuery(cq);
		List<Departamento> listaDepartamentos = qCriteria.getResultList();
		
		System.out.println("........Los Departamentos: ");
		for(Departamento d: listaDepartamentos) {
			System.out.printf("%s con id: %s en localidad: %s  %n",d.getNombreDepartamento(), d.getManager_id(), d.getIdLocalidad());
		}
		
	}

}
