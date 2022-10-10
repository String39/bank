package modulo7.enumeraciones;

public class Carta {
	
	//ATRIBUTOS
	private Palos palo;
	private int valor;
	
	//Constructor
	public Carta(Palos palo, int valor) {
		super();
		this.palo = palo;
		this.valor = valor;
	}
	
	//metodos
	public Palos getPalo() {
		return palo;
	}
	public int getValor() {
		return valor;
	}
}
