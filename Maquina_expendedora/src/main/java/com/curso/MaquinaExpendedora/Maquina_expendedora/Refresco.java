package com.curso.MaquinaExpendedora.Maquina_expendedora;

public class Refresco 
{
	private double precio;
	private String sabor;
	private int cl;
	private boolean agotado = false;
	private int stock= 20;
	
	
	public Refresco(double precio, String sabor, int cl, boolean agotado, int i) {
		super();
		this.precio = precio;
		this.sabor = sabor;
		this.cl = cl;
		this.agotado = agotado;
		this.stock = i;
	}



	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public int getCl() {
		return cl;
	}
	public void setCl(int cl) {
		this.cl = cl;
	}
	public int isStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public boolean isAgotado() {
		return agotado;
	}
	
	
	
	
	
	
	
}
