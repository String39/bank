package com.curso.modulo4.Bolea001_javaSE;

public class PruebaAndOrCortocircuitado 
{
	public static void main(String[] args) 
	{
		Pedido p = new Pedido(2);
		p.setObservaciones("URGENTE");
		if(p!=null && p.getObservaciones()!= null && p.getObservaciones().equals("URGENTE")) {
			System.out.println("envio ya el pedido");
		}
		else {
			System.out.println("puede esperar");
		}
	}
}
