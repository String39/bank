package com.example.spring.repositorio;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.example.spring.entidades.Pedido;

@Repository
@Qualifier("pedidoRepoJPA")
public class PedidoJPARepositoryImp  implements PedidoRepository{
	
	private static Logger Log = LoggerFactory.getLogger(PedidoJPARepositoryImp.class);

	@Override
	public void add(Pedido pedido) {
		Log.info("grabar pedido con jpa");		
	}

	@Override
	public Collection<Pedido> getPedidosByUser(String user) {
		return null;
	}

}
