package com.curso.mercado.entidades;

import java.io.Serializable;
import java.util.Objects;

public class Usuario implements Serializable {
	private String nombre;
	private String roll;
	
	
	public Usuario() {
		super();
	}
	public Usuario(String nombre, String roll) {
		super();
		this.nombre = nombre;
		this.roll = roll;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", roll=" + roll + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre, roll);
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
		return Objects.equals(nombre, other.nombre) && Objects.equals(roll, other.roll);
	}
	
	
	
	
}
