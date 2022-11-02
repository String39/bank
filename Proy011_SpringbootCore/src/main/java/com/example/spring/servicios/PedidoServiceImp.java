package com.example.spring.servicios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.entidades.Pedido;
import com.example.spring.repositorio.PedidoRepository;
import com.example.spring.repositorio.PedidoRepositoryImp;

@Service
public class PedidoServiceImp implements PedidosService{

	private static Logger Log = LoggerFactory.getLogger(PedidoServiceImp.class);
	
	@Autowired
	//Se hace con las interfaces no con las clases
	private PedidoRepository repo;
	
	@Override
	public void generarPedido(Pedido p) {
		Log.info("GEstiono un pedido");
		repo.add(p);
	}

}
