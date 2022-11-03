package com.example.spring.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//@Entity
public class Pedido implements Serializable{

	private Integer id;
	@NotNull
	@Size(min=5)
	private String user;
	@NotNull
	@Size(max=50)
	private String descripcion;
	@NotNull
	private Date fechaPedido;
	private boolean entregado;
	
	public Pedido() {
	}

	public Pedido(Integer id, String user, String descripcion, Date fechaPedido, boolean entregado) {
		super();
		this.id = id;
		this.user = user;
		this.descripcion = descripcion;
		this.fechaPedido = fechaPedido;
		this.entregado = entregado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
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
		Pedido other = (Pedido) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", user=" + user + ", descripcion=" + descripcion + ", fechaPedido=" + fechaPedido
				+ ", entregado=" + entregado + "]";
	}
	
	
}
