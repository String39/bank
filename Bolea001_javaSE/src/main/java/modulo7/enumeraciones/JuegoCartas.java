package modulo7.enumeraciones;

//se puede importar Palos pero no es recomendable
public class JuegoCartas {
	
	public static void main(String[] args) {
		
		Carta c1 = new Carta(Palos.OROS, 2);
		System.out.println(Palos.OROS);
		//System.out.println(Palos.OROS.ordinal());
		
		Palos[] valores = Palos.values();
		
		System.out.println("----los palos son");
		
		for(Palos p:valores) {
			System.out.printf("%s ordinal %d %n",p,p.ordinal());
		}
		
		if(c1.getPalo()==Palos.OROS) {
			System.out.println("-----eres el mejor");
		}
	}

}
