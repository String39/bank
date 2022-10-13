package modulo8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PruebasExcepciones {
	public static void main(String[] args) 
	{
//		int r = doble ("2");
//		System.out.printf("El doble de %d es %d %n ",2,r);
		
		int r = doble ("2");
		System.out.printf("El doble de %d es %d %n ",2,r);
		
		guardarResultado("resultado.txt", r);
	}
	
	public static int doble (String numero) {
		//validar que el numero es valido
		
		//la clase wrapper Integer metodo parseInt que convierte
		//un String en un int
		//sino puede lanza una excepcion
		int numeroInicial =0;
		try {
			//este cod es susceptible de lanzar NumberFormatException u otras
			numeroInicial=Integer.parseInt(numero);
			numeroInicial *= 2;
		}
		catch(NumberFormatException e) {
			System.out.println("No se puede calcular " + e.getMessage());
			//System.out.println("No se puede clacular");
		}
		catch(Exception e) {
			System.out.println("Error Desconocido");
		}
		//Calcular el doble
		return numeroInicial *2;
	}
	
	public static void guardarResultado(String nombreFichero , int resultado) {
		File f = new File(nombreFichero);
		File f2 = new File("parametro.txt");
		
		try 
		{
			//lanza un IOException
			f.createNewFile();
			
			//lanza FileNotFoundException
			FileReader fr = new FileReader(f2);
			System.out.println(".....aqui");
			
		} 
		catch(FileNotFoundException e) {
			System.out.println("El fichero parametros.txt no existe");
			return;  //antes del return ejecuta finally
		}
		catch (IOException e) 
		{
			System.out.println("No puedo crear el fichero de salida");
			throw new RuntimeException("fnfangnasn");  //antes de irse ejecuta finally
		}
		catch(Exception e) 
		{
		System.out.println("Error desconocido" + e.getMessage());		
		}
		finally {
			System.out.println("---------------- siempre si o si me ejecuto");
		}
		
		System.out.println("despues del try catch");
		}
	}

