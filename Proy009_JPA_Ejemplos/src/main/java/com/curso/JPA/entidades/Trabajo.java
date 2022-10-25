package com.curso.JPA.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "JOBS", schema="HR")
public class Trabajo implements Serializable{

	/**
	 * Indica la version de la clase
	 */
	private static final long serialVersionUID = 1L;
	
	//atributos

}
