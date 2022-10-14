package colecciones;

import java.util.*;


public class EjemploColecciones {
	public static void main(String[] args) {
		//Clase que permiten colecccionar una coleccion de obj
		//tamaño ilimitado
		//solo admiten obj
		//muchos tipos de colecciones
		
		//Collection <<I>>  (value)
		//	Set <<I>>			NO DUPLICADOS
			// HashSet			NO ORDENADOS
			//TreeSet			ORDENADOS por orden inserccion
			//LinkedHashSet		ORDEN natural  (Comparable/Comparator)
		// 	List<<I>>			PERMITEN DUPLICADOS ,  elementos indexados
			//ArrayList			.add(obj)     .add(index.obj)    .get(index)
			//LinkedList
			//Queu
		
		//Map <<I>> (Key - value)
		
		//Clase utilidad Collecions y Arrays
		
		//Colleciones Genericas
		
		//Comprable y comparators
		
//		Collection c;  //Interface
//		//Set<String> s; //INterface Collecciones NO DUPLICADOS
//		
//		Set s = new HashSet<>();
//		s.add("Zapato");
//		s.add("Avion");
//		s.add(new Integer (2));
//		s.add(3);
//		s.add(3);
//		s.remove("Avion");
//		
//		for(Object o:s) {
//			System.out.println(o);
//		}
//		
//		//Set<String> nombres = new HashSet();
//		//Set<String> nombres = new LinkedHashSet<>(); //Aparacen emn el mismo orden de inserccion
//		Set<String> nombres = new TreeSet<>(); //orden alfabetico
//		nombres.add("PEDRO");
//		nombres.add("Lucas");
//		nombres.add("dsgs");
//		nombres.add("dkasd");
//		boolean añadido =nombres.add("dkasd");
//		
//		if(!añadido) System.out.println("No pudo añadir otra vez dkasd");
//		
//		for(String n : nombres) {
//			System.out.println(n.toUpperCase());
//		}
//		
//		System.out.println("------------------");
//		
//		Punto p1 = new Punto(0, 2);
//		Punto p2 = new Punto(1,1);
//		Punto p3 = new Punto(1, 5);
//		Punto p4 = new Punto(1, 5);  //repite
//		
//		
//		//NO PERMITE DUPLICADOS
//		//Set<Punto> figura = new HashSet<>();
//		Set<Punto> figura = new TreeSet();
//		
//		figura.add(p1);
//		figura.add(p2);
//		figura.add(p3);
//		figura.add(p4);
//		for(Punto p:figura) {
//			System.out.println(p);
//		}
		
		//Comparator
		
//		Set<String> apellidos = new TreeSet(new ComparadorStringPorOrdenInverso()); //orden alfabetico
//		apellidos.add("Juan");
//		apellidos.add("Txus");
//		apellidos.add("Carlos");
//		apellidos.add("David");
//		
//		for(String n : apellidos) {
//			System.out.println(n.toUpperCase());
//		}
		
		
		
		//COLLECCIONES de TIPO LIST
		
//		List<String> paises = new ArrayList<String>();
//		paises.add("Francia");
//		paises.add("Italia");
//		paises.add("Portugal");
//		paises.add("Holanda");
//		paises.add("Holanda");
//		paises.add("Alemania");
//		
//		paises.add(1,"Belgica");
//		//paises.add(20,"otro"); //daria error lanza una excepcion
//		
//		System.out.println("Pais en la pos 0 es: " + paises.get(0));
//		
//		System.out.println("----------Lista Paises:..........");
//		for(String p : paises) {
//			System.out.println(p);
//		}
//		
//		//ordenar alfabeticamente
//		Collections.sort(paises); //es una collecion de String
//								  // ordena tomando el comparable
//		
//		System.out.println("----------Lista Paises Ordenados:..........");
//		for(String p : paises) {
//			System.out.println(p);
//		}
//		
//		Collections.sort(paises, new ComparadorStringPorOrdenInverso());
//		System.out.println("----------Lista Paises Orden Inverso:..........");
//		for(String p : paises) {
//			System.out.println(p);
//		}
//		
//		
//		LinkedList<String> lista = new LinkedList<String>();
//		lista.addFirst("Hola");
//		lista.add("Buenas");
//		lista.addLast("Adios");
//		lista.getFirst();
////		for(String p : lista) {
////			System.out.println(p);
////		}
//		
		//COLAS
		PriorityQueue<Integer> cola = new PriorityQueue<Integer>();
		cola.add(39);
		cola.add(1);
		cola.add(13);
		cola.add(32);
		cola.add(22);
		cola.add(31);
		
		for(Integer i : cola) {
			System.out.println(i);
		}
		
		Integer trato =cola.peek();
//		System.out.println("Me entrega " + trato);  //me ntrega el que esta el primero en la cola
//		System.out.println(cola.peek());
		
		System.out.println("----------");
		System.out.println(cola.poll());
		System.out.println(cola.poll());
		System.out.println(cola.poll());
		System.out.println("----------");
		for(Integer i : cola) {
			System.out.println(i);
		}
		
	}
}
