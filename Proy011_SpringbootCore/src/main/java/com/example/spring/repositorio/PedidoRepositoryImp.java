package com.example.spring.repositorio;

import org.slf4j.*;
import com.example.spring.entidades.Pedido;

public class PedidoRepositoryImp implements PedidoRepository{

	private static Logger Log = LoggerFactory.getLogger(PedidoRepositoryImp.class);
	
	@Override
	public void add(Pedido pedido) {
		Log.info("HAs grabado un pedido en la base de datos");
	}

}
