package modulo5;

public class EjemploArrayMultidimensional {

	public static void main(String[] args) 
	{
//		int [][][][][] datos;
//		int [][][] datos2[][];
		
		int[][] d = new int[3][5];
		d[0][1]	=4;
		
		for(int[] f:d) {
			for(int c:f) {
				System.out.print(c);
			}
			System.out.println();
		}
		
		
		//crear un array de 2 dimensiones irregular
		int[][] notas = new int[3][];
		notas[0] = new int[2];
		notas[1] = new int[6];
		
		notas[1][2] = 7;
		//notas[2][1]=47; //error nullpointerexception
		
	
	
		int[][][] grande = new int [3][][];
		/*
		 * grande  ---> NULL   		|   NULL    	|   NULL
		 * 				grande[0]		grande[1]		grande [2]
		 * espera que en estas 3 posiciones guardemos int [][]
		 */
		
		grande[0] = new int[2][2];
		/*
		 * grande  ---> NULL   		|   NULL    	|   NULL
		 * 				grande[0]		grande[1]		grande [2]
		 * 					|				
		 * 					|
		 * 					v
		 * 				dir |dir
		 * 					|
		 * 					v
		 * 				   0|0
		 * espera que en estas 3 posiciones guardemos int [][]
		 */
		

}}
