package com.curso.modulo4.Bolea001_javaSE;

import java.util.Date;

public class PruebaPedido {

	public static void main(String[] args) 
	{
		//dos posibles formas de crear un obj Producto
		Pedido p = new Pedido(1);
		p.setCantidad(10);
		p.setIdProducto(45);
		p.setFechaPedido(new Date());
		p.setObservaciones("urge");
		
		System.out.println(p);

		Pedido p2 = p;
		System.out.println(p2);
		System.out.println(p2.getIdPedido());
		
		//System.out.println(p2.toString());
		
	}

}
