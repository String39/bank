package com.curso.Proy003EnRAya;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TresEnRayaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	@Test
	public void sumarDosMasDosDara4() {
		//datos entrada prueba
		TresEnRaya juego = new TresEnRaya();
		int n= 2;
		int n2 = 2;
		
		//resultado esperado
		int espero = 4;
		
		//resultado obtenido
		int resultado = juego.suma(n,n2);
		
		//sino coinciden fallo
		if(espero != resultado) {
			fail("No ha sumado 2+2 = 4 sino que el resultado es" + resultado);
		}
	}
	
	@Test(expected= RuntimeException.class)
	public void PonerFichaEnCoordenadaXMalLanzaUnaExcepcion() 
	{
		TresEnRaya juego = new TresEnRaya();
		//3 filas y 3 columnas  (0 a 2)
		juego.jugar(4,2); // falla sino lanza un RunTimeExcepcion
		
	}
	
	@Test(expected= RuntimeException.class)
	public void PonerFichaEnCoordenadaYMalLanzaUnaExcepcion() 
	{
		TresEnRaya juego = new TresEnRaya();
		//3 filas y 3 columnas  (0 a 2)
		juego.jugar(2,4); // falla sino lanza un RunTimeExcepcion
		
	}
	
	@Test(expected= RuntimeException.class) 
	public void ponerFichaEnPposicionOcupadaLanzaUnaExcepcion() {
		//Preparar el escenario
		TresEnRaya juego = new TresEnRaya();
		juego.jugar(0, 0);
		
		juego.jugar(0, 0); //debe lanzar una excepcion
	}
	
	@Test
	public void ponerFichaXeYBienEsperaQueEnEstaPosicionYaNoSeaNull() {
		TresEnRaya juego = new TresEnRaya();
		juego.jugar(0, 0);
		
		if(juego.verFicha(0,0) == null) {
			fail("la ficha debe estar en esta posicion");
		}
	}
	
	@Test
	public void primerJugadorEsX() {
		TresEnRaya juego = new TresEnRaya();
		
		if(juego.getJugadorActual() !='X'){
			fail("El primer jugador debe ser X");
		}
	}
	
	@Test
	public void siAnteriorJugadorEsAhoraEsO() {
		TresEnRaya juego = new TresEnRaya();
		juego.jugar(0, 0);
		if(juego.getJugadorActual() !='O'){
			fail("El primer jugador debe ser O");
		}
	}
	
	@Test
	public void siAnteriorJugadorEsAhoraEsX() {
		TresEnRaya juego = new TresEnRaya();
		juego.jugar(0, 0);
		juego.jugar(0, 2);
		if(juego.getJugadorActual() !='X'){
			fail("El primer jugador debe ser X");
		}
	}

	@Test
	public void ganadorSi3FichasHorizontal() {
		TresEnRaya juego = new TresEnRaya();
		juego.jugar(0, 0);
		juego.jugar(0, 1);
		juego.jugar(0, 2);
		if(juego.ganador() == 'X') {
			fail("Ha ganado x");
		}else {
			fail("Ha ganado y");
		}
	}
}
