package com.flota.dominio;

/**
 * Clase que representa un vehiculo de una flota 
 * que puede transportar caja pero tiene una carga maxima permita
 * 
 * @author David
 * @version 1.0
 *
 */

public class VehiculoMejorado {
	//atributos
	private double cargaMaxima ;
	private double cargaActual = 0.0;
	private String matricula ;
	protected int numCajas = 0;

//	//guion bajo solo para constantes
//	public final double CARGA_MAXIMA = 434234.2352;
	
	// constructor
	protected VehiculoMejorado(String matricula, double cargaMaxima) 
	{
		// validar matricula no null
		// validar cargaMaxima > 0
		this.matricula = matricula;
		this.cargaMaxima = cargaMaxima;
	}

	// metodos
	public double getCargaMaxima() 
	{
		return cargaMaxima;
	}

	public void setCargaMaxima(double cargaMaxima)
	{
		if (cargaMaxima < 0) 
		{
			throw new RuntimeException("No puede pasar una carga negativa");
		}
		this.cargaMaxima = cargaMaxima;
	}

	public String getMatricula() {
		return matricula;
	}

//	public void setMatricula(String matricula) {
//		this.matricula = matricula;
//	}
	
	/**
	 * Metodo que recibe el peso de la caja a cargar 
	 * e incrementa el peso actual del camion y el 
	 * numero de cajas cargadas
	 * Si el peso no es valido <0 lanza una excepcion
	 * si el peso a cargar supera el maximo permitido ....
	 * 
	 * @param peso Peso de la caja a cargar en kg
	 * @throws RuntimeException el peso de la caja no es valdo o supera la 
	 * carga maxima permitida
	 */
	//metodo publico con argumentos siempre validarlos
	public void cargaCaja (double peso) 
	{
		//validar que el peso > 0
		if(peso <=0) {
			throw new RuntimeException("NO puede ser peso negativo");
		}
		
		//validar que cabe, no supera la carga maxima
		if(peso + cargaActual > cargaMaxima) 
		{
			throw new RuntimeException("No caben mas cajas");
		}
		
		this.cargaActual += peso;
		this.numCajas ++;
	}
	
	public void cargarCaja(Caja c) {
		cargaCaja(c.getPeso());
	}
	
	public double getCargaActual() 
	{
		return cargaActual;
	}
	
	public int getNumCajas() 
	{
		return numCajas;
	}
}
