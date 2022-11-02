package com.example.spring.repositorio;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.example.spring.entidades.Pedido;

@Repository
@Qualifier("pedidoRepo")
public class PedidoRepositoryImp implements PedidoRepository{

	private static Logger Log = LoggerFactory.getLogger(PedidoRepositoryImp.class);
	
	public PedidoRepositoryImp() {
			Log.info("....instanciando PedidoRepositoryImp");
	}
	
	@Override
	public void add(Pedido pedido) {
		Log.info("HAs grabado un pedido en la base de datos");
	}

}
