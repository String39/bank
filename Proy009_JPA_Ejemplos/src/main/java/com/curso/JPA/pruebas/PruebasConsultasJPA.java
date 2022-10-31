package com.curso.JPA.pruebas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaBuilder.In;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.curso.JPA.entidades.Departamento;
import com.curso.JPA.entidades.Empleado;

public class PruebasConsultasJPA {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("OracleHRPU");
		EntityManager em = factory.createEntityManager();
		
//		Departamento d = em.find(Departamento.class, 10);
//		System.out.println("El departamento es " + d);
		
		// QUERY NATIVA (bd)  =>SELECT * FROM DEPARTMENTS
		//JPA QUERY => SELECT d FROM Departamento d;
		
		//MODO 1	
//		Query consulta = em.createQuery("SELECT d "
//				+ " FROM Departamento d "
//				+ " WHERE d.manager_id IS NULL" );
//		
//		List<Departamento> lista = consulta.getResultList();
//		
//		System.out.println("Lista de departamentos sin manager");
//		for (Departamento d2: lista) {
//			System.out.println(d2);
//		}
		
//		
//		//MODO 2 --NAMED QUERIES
//		Query consulta2= em.createNamedQuery("Departamento.findByManager");
//		List<Departamento> lista2 = consulta2.getResultList();
//		
//		System.out.println("Lista de todos los departamentos");
//		for (Departamento d2: lista2) {
//			System.out.println(d2);
//		}
		
		//MODO 3 --NATIVA QUERY
//		Query consulta3= em.createNativeQuery("SELECT * FROM DEPARTMENTS", Departamento.class);
//		List<Departamento> lista3 = consulta3.getResultList();
//		
//		System.out.println("Lista de departamentos con NAtive Query");
//		for (Departamento d2: lista3) {
//			System.out.println(d2);
//		}
		
		
		//EJECUTAR UNA CONSULTA CON PARAMETROS
//		Query qConParam =em.createNamedQuery("Departamento.findByManager");
//		qConParam.setParameter("manager_id", 108);
//		List<Departamento> departamentos108 = qConParam.getResultList();
//		System.out.println("Los departamentos del manager 108 son: ");
//		for(Departamento d3: departamentos108) {
//			System.out.println(d3);
//		}
		
		/*
		 * select d.department_id, d.department_name, e.first_name, e.last_name	
			from departments d inner join employees e on d.manager_id = e.employee_id;
		 */
		
//		String consultaEmpleadoDptoLoc1700 =
//				"SELECT e FROM Empleado e "
//				+ " WHERE e.departamento.idLocalidad = :idLoc";
//		int idLocalidad = 1700;
//		Query q = em.createQuery(consultaEmpleadoDptoLoc1700);
//		q.setParameter("idLoc", idLocalidad);
//		List<Empleado> listEmpl = q.getResultList();
//		System.out.println("Lista empleados departamento localidad 1700");
//		for(Empleado e :listEmpl) {
//			System.out.println(e);
//		}
		
		
		//CRITERIA
		//PANTALLA: FILTRO DE BUSQUEDA Y LISTA RESULTADO DE LA BUSQUEDA
		//filtro NOMBRE
		//filtro JOB_ID
		
		String nombre= "Steven";
		String apellidos = null;
		String idJob = null;
		Double salario = 999.0;
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		
		//Entidades quiero recuperar
		CriteriaQuery<Empleado> cq = cb.createQuery(Empleado.class);
		
		//from
		Root<Empleado> empleado = cq.from(Empleado.class);
		
		//objeto tipo Predicate que va montando el condiciones del where
		Predicate miWhere = null;
		List<Predicate> condiciones = new ArrayList<>();
		
		//si me has pasado un nombre de emple lo añado al where
		if(nombre !=null) {
			//cq.where(cb.equal(empleado.get("nombre"), nombre));
			condiciones.add( cb.equal(empleado.get("nombre"), nombre));
		}
		if(apellidos!= null) {
			//cq.where(cb.equal(empleado.get("apellidos"), apellidos));
			condiciones.add(cb.equal(empleado.get("apellidos"), apellidos));
		} //se puede añadir mas criterios
		if(salario !=null) {
			condiciones.add(cb.greaterThan(empleado.get("salario"), salario));
		}
		
		//OR JOBID='AD_ASST'
		Predicate todosAnd = cb.and(condiciones.toArray(new Predicate[0]));
		Predicate job = cb.equal(empleado.get("idTrabajo"), "AD_ASST");
		Predicate whereFinal =	cb.or(todosAnd, job);
		cq.where(whereFinal);
		
//		//WHERE
//		if(condiciones.size()>0) {
//			//ArrayList en un Array de Predicate
//			Predicate[] condicionesFinal = new Predicate[condiciones.size()];
//			condiciones.toArray(condicionesFinal);
//			cq.where(condicionesFinal);
//			cq.where(condiciones.toArray(new Predicate[0]));
//		}
		
		//Ejecutar la cnosulta
		Query qCriteria  = em.createQuery(cq);
		List<Empleado> listaEmpleados = qCriteria.getResultList();
		
		System.out.println("........LOS EMPLEADOS: ");
		for(Empleado e: listaEmpleados) {
			System.out.printf("%s %s %.2f %n",e.getNombre(), e.getApellidos(), e.getSalario());
		}
	}
}
