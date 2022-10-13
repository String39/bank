package com.flota.dominio;

public class Aeropuerto {
	public void gestionarVuelo(Volable v) 
	{
		v.aterrizar();
		v.despegar();
		v.volar();
	}
	
	public static void main(String[] args) 
	{
		//la var de ref puede apautar a cualquier obj 
		//de la clase que implemente el interfaz volable
		Volable v = new Avion("sdsdkgsd", 100);
		
		Aeropuerto aeropuerto = new Aeropuerto();
		aeropuerto.gestionarVuelo(v);
		
		Pajaro p = new Pajaro();
		aeropuerto.gestionarVuelo(p);
		
	}
}
