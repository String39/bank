package com.example.spring.entidades;

import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Usuario {
	
	@NotNull
	@Size(min=2, max=20)
	private String nombre;
	
	@NotNull
	@Size(min=5)
	private String clave;
	private String roll;
	
	public Usuario() {
	}

	public Usuario(String nombre, String clave, String roll) {
		super();
		this.nombre = nombre;
		this.clave = clave;
		this.roll = roll;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", clave=" + clave + ", roll=" + roll + "]";
	}
	
	
}
