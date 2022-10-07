package com.curso.Proy003EnRAya;

/**
 * Implementa el juego de 3 en raya
 * REQUISITO 1:
 * 	
 * REQUISITO 2:
 */
public class TresEnRaya {
	
	//atributos
	private Character[][] tablero;
	private Character jugadorActual;
	
	//constructor
	public TresEnRaya() {
		this.tablero = new Character[3][3];
		this.jugadorActual = 'X';
	}
	
	public Character getJugadorActual() {
		return jugadorActual;
	}
	public void setJugadorActual(Character jugadorActual) {
		this.jugadorActual = jugadorActual;
	}


	//metodos
	public int suma(int n, int n2) {
		return n +n2;
	}

	public void jugar(int x, int y) {
		validarCoordenadaX(x);
		validarCoordenadaY(y);
		ponerFicha(x, y);	
	}

	public Character verFicha(int x, int y) {
		validarCoordenadaX(x);
		validarCoordenadaY(y);
		return this.tablero[x][y];
	}
	
	private void validarCoordenadaX(int x) {
		if(x<0 || x>2) {
			throw new RuntimeException("La ficha no se puede posicionar fuera del tablero");
		}
	}
	
	private void validarCoordenadaY(int y) {
		if(y<0 || y>2) {
			throw new RuntimeException("La ficha no se puede posicionar fuera del tablero");
		}
	}
	
	private void ponerFicha(int x, int y) {
		if(tablero[x][y] !=null) {
			throw new RuntimeException("Ya hay una ficha en esta posicion");
		}
		tablero[x][y] = this.jugadorActual;
		
		if(this.jugadorActual=='X') {
			this.jugadorActual ='O';
		}else {
			this.jugadorActual='X';
		}
	}

	public char ganador() {
//		validarCoordenadaX(x);
//		validarCoordenadaY(y);
//		ponerFicha(x, y);
		Character[] f = new Character[3];
		for(int i =0; i>2; i++) {
			for(int j=0; i>2; j++) {
				if(tablero[i][j] =='X') {
					f[j] ='X';
				}
				j++;
			}
			i++;
		}
		return 'X';
	}

}
