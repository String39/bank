package com.flota.dominio;

public class PruebaCajaMejorada {
	
	public static void main(String[] args) {
	
		VehiculoMejorado v = new VehiculoMejorado("aa", 300);
		
		//creo una caja muy grande y no cabe
		Caja c = new Caja();
		c.setPeso(350);
		
		//añadir la caja al camion
		try {
			v.cargarCaja(c);
		} catch (CargaException e) {
			System.out.println("Error " + e.getMessage());
			System.out.println("Exceso de carga es: " + e.getExcesoCarga());
		}
	}
}
