package com.curso.JPA.entidades;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder.In;

@Entity
@Table(name = "DEPARTMENTS")
@NamedQueries({
	@NamedQuery(name = "Departamento.findAll", 
			query = "SELECT d FROM Departamento d"),
	@NamedQuery(name = "Departamento.findByManager", 
			query = "SELECT d FROM Departamento d WHERE d.manager_id= :manager_id"),
	@NamedQuery(name = "Departamento.findSinManager", 
			query = "SELECT d FROM Departamento d WHERE d.manager_id IS NULL"),
})
public class Departamento implements Serializable{
	
	@Id
	@Column(name = "DEPARTMENT_ID")
	private Integer id;
	
	@Column(name = "DEPARTMENT_NAME")
	private String nombreDepartamento;
	
	@Column(name = "MANAGER_ID")
	private Integer manager_id;
	
	@Column(name = "LOCATION_ID")
	private Integer idLocalidad;

	public Departamento() {
		super();
	}

	public Departamento(Integer id, String nombreDepartamento, Integer manager_id, Integer idLocalidad) {
		super();
		this.id = id;
		this.nombreDepartamento = nombreDepartamento;
		this.manager_id = manager_id;
		this.idLocalidad = idLocalidad;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	public Integer getManager_id() {
		return manager_id;
	}

	public void setManager_id(Integer manager_id) {
		this.manager_id = manager_id;
	}

	public Integer getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(Integer idLocalidad) {
		this.idLocalidad = idLocalidad;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nombreDepartamento=" + nombreDepartamento + ", manager_id=" + manager_id
				+ ", idLocalidad=" + idLocalidad + "]";
	}
	
	
	
}
