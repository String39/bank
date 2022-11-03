package com.example.spring.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="PEDIDOS")
public class Pedido implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PED_SEQ")
	@SequenceGenerator(sequenceName = "PEDIDO_SEQ", name = "PED_SEQ", allocationSize=1)	
	private Integer id;

	@NotNull
	@Column(name="USUARIO")
	private String user;
	
	@NotNull
	@Column(name="DESCRIPCION")
	private String descripcion;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_PEDIDO")
	private Date fechaPedido;
	
	@Column(name="ENTREGADO")
	private boolean entregado;
	
	//no va a base de datos
//	@Transient
//	private boolean seleccionado;
	
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
