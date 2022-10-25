package com.curso.JPA.entidades;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;


@Entity
@Table(name= "JOBS", schema="HR")
public class Trabajo implements Serializable{

	/**
	 * Indica la version de la clase
	 */
	private static final long serialVersionUID = 1L;
	
	//atributos
	@Id
	@Column(name="JOB_ID")
	private String id;
	@Column(name="JOB_TITLE")
	private String tituloTrabajo;
	@Column(name="MIN_SALARY")
	private double salarioMin;
	@Column(name="MAX_SALARY")
	private double salarioMax;
	
	public Trabajo() {}

	public Trabajo(String id, String tituloTrabajo, double salarioMin, double salarioMax) {
		super();
		this.id = id;
		this.tituloTrabajo = tituloTrabajo;
		this.salarioMin = salarioMin;
		this.salarioMax = salarioMax;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTituloTrabajo() {
		return tituloTrabajo;
	}

	public void setTituloTrabajo(String tituloTrabajo) {
		this.tituloTrabajo = tituloTrabajo;
	}

	public double getSalarioMin() {
		return salarioMin;
	}

	public void setSalarioMin(double salarioMin) {
		this.salarioMin = salarioMin;
	}

	public double getSalarioMax() {
		return salarioMax;
	}

	public void setSalarioMax(double salarioMax) {
		this.salarioMax = salarioMax;
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
		Trabajo other = (Trabajo) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Trabajo [id=" + id + ", tituloTrabajo=" + tituloTrabajo + ", salarioMin=" + salarioMin + ", salarioMax="
				+ salarioMax + "]";
	}
	
	
	
}
