package com.curso.modulo4.Bolea001_javaSE;

public class EjemploContinue {

	public static void main(String[] args) {
		// brak y continue
		
		int a=7;
		
//		//caso 1
//		for(int i = 2; i<a; i++) {
//			System.out.println("Linea " + i);
//			if(i==4) break;
//			System.out.println(" y escribo esto  ");
//		}
		
//		//caso 2. CONTINUE
//		for(int i = 2; i<a; i++) {
//			System.out.println("Linea " + i);
//			if(i==4) 
//				continue;
//			System.out.println(" y escribo esto  ");
//			//mas codigo
//		}
		
		//caso 3. Break anidado sin etiquetas
//		for (int i = 2; i < a; i++) 
//		{
//			System.out.println("Linea " + i);
//			for(int j=0; j<3;j++) 
//			{
//				System.out.println(j); //0
//				if (i == 4) break;
//					System.out.println(" y escribo esto  ");
//			}
//			System.out.println("---bucle externo-----");
//			//mas codigo
//		}
		
//		//caso 4. Break anidado con etiquetas
//		forexterno:
//				for (int i = 2; i < a; i++) 
//				{
//					System.out.println("Linea " + i);
//					for(int j=0; j<3;j++) 
//					{
//						System.out.println(j); //0
//						if (i == 4) break forexterno;
//							System.out.println(" y escribo esto  ");
//					}
//					System.out.println("---bucle externo-----");
//					//mas codigo
//				}
		
		//caso 5. Continue anidado con etiquetas
				forexterno:
						for (int i = 2; i < a; i++) 
						{
							System.out.println("Linea " + i);
							for(int j=0; j<3;j++) 
							{
								System.out.println(j); //0
								if (i == 4) continue forexterno;
									System.out.println(" y escribo esto  ");
							}// fin for interno
							System.out.println("---bucle externo-----");
							//mas codigo
						}
		
	}

}
