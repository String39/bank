package com.curso.MaquinaExpendedora.Maquina_expendedora;

import java.util.List;

public class Expendedora 
{
	private List<Refresco> refresco;
	private double cambios;
	private int ventas;
	
	public Expendedora() {
		super();
		this.cambios = 500;
		this.ventas = 0;
	}

	public List<Refresco> getRefresco() {
		return refresco;
	}

	public void setRefresco(List<Refresco> refresco) {
		this.refresco = refresco;
	}

	public double getCambios() {
		return cambios;
	}

	public void setCambios(double cambios) {
		this.cambios = cambios;
	}
	
	public void ReponerRefresco(Refresco r) 
	{
		for (int i=0; i<r.isStock(); i++) 
		{
			if(!refresco.contains(r)) {
				refresco.add(r);
			}else {
				System.out.println("Producto ya existente");
			}
		}
	}
	
	public void quitarRefresco(Refresco r) 
	{
		for (int i=0; i<r.isStock(); i++) 
		{
			if(refresco.contains(r)) {
				refresco.remove(r);
			}else {
				System.out.println("Producto no encontrado");
			}
			}
		}
	
	
	public void Informe() 
	{
		for (Refresco r :refresco) {
			System.out.println(r);
		}
		
	}
	
	
}
