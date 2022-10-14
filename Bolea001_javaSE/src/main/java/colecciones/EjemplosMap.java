package colecciones;

import java.util.*;

public class EjemplosMap {
	public static void main(String[] args) {
		//map <<Interface>>
		//	.solo trabajan con obj
		//	.key  -unico NO DUPLICADOS
		//	.value - si duplicamos
		Map map;
		//map.put(key, value);
		//map.get(key,value);
		
		//key no duplicado - value
		map = new HashMap();  //no ordenado
		//Puedes cambiar entre HasMap, TreeMap y LinkedHasMap
		Map<Integer, Punto> figura = new HashMap();
		figura.put(1, new Punto(0,0));
		figura.put(10, new Punto(4,6));
		figura.put(10, new Punto(8,8));
		
		System.out.println(figura.get(10));
		
		figura.remove(1);
		System.out.println(figura.get(1));
		
		//añdao mas puntos
		figura.put(11, new Punto(2,3));
		figura.put(3, new Punto(1,1));
		figura.put(4, new Punto(5,8));
		
		Collection<Punto> valores = figura.values();
		Set<Integer> claves =figura.keySet();
		System.out.println(" ");
		System.out.println("-----Recorre los valores-----");
		for(Punto p:valores) {
			System.out.println(p);
		}
		
		System.out.println(" ");
		System.out.println("------Recorrre las claves y sus valores");
		for(Integer clave : claves) {
			System.out.println("Clave: " +clave + " " + figura.get(clave));
		}
		//Para la key es obligatorio hace el hascode y equals
		
		//-------------------
		//HasMap  -- Recorro la colleccion a traves del Key. NO ordenado
		//LinkedHasMap  --- Recorro la coleccion a traves de la Key por orden de inserccion
		//TreeMap --Recorro al coleccion a traves de la Key por orden de Comparable/Comparator
		
		
	
	}

	

	
}
