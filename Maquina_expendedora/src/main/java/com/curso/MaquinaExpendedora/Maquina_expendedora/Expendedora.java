package com.curso.MaquinaExpendedora.Maquina_expendedora;

public class Expendedora 
{
	private Refresco[] refresco;
	private double cambios;
	private int ventas;
	
	public Expendedora() {
		super();
		this.cambios = 500;
		this.ventas = 0;
	}

	public Refresco[] getRefresco() {
		return refresco;
	}

	public void setRefresco(Refresco[] refresco) {
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
			if(refresco[i].isAgotado()) {
				refresco[i] = new Refresco(i, null, i, false, i);
			}
		}
	}
	
	public void quitarRefresco(Refresco r) 
	{
			
	}
	
	public void Informe(Refresco r) {
		
	}
	
	
}
