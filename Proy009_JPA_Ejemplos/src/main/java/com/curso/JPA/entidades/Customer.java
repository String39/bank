package com.curso.JPA.entidades;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

@Entity
public class Customer implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, 
								generator = "MICURSO_SEQ")
	@SequenceGenerator(sequenceName = "CURSO_SEQ", name = "MICURSO_SEQ", allocationSize=1)
	private Integer id;
	@Column (name = "CUSTOMER_NAME")
	private String customerName;
	//private Long recordId;
	
	@OneToOne
	@JoinColumn(name = "CUSTRECORD_RECID")  //FK
	private Record record;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer id, String customerName, Record record) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.record = record;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
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
		Customer other = (Customer) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerName=" + customerName + "]";
	}

	
	
	
}
