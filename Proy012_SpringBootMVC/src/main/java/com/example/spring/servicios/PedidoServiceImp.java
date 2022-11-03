package com.example.spring.servicios;

import java.util.Collection;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.example.spring.entidades.Pedido;
import com.example.spring.repositorio.PedidoRepository;
import com.example.spring.repositorio.PedidoRepositoryImp;

@Service
//@Lazy
public class PedidoServiceImp implements PedidosService{

	private static Logger Log = LoggerFactory.getLogger(PedidoServiceImp.class);
	
	@Autowired
	//Se hace con las interfaces no con las clases
	//@Qualifier("pedidoRepoJPA")
	@Qualifier("pedidoRepo")
	private PedidoRepository repo;
	
	public void PedidoRepositoryImp() {
		Log.info("....instanciando PedidoServiceImp " + repo);
	}
	
	@PostConstruct
	public void init() {
		Log.info("..postconstructor " + repo);
	}
	
	@Override
	public void generarPedido(Pedido p) {
		Log.info("GEstiono un pedido");
		repo.add(p);
	}

	@Override
	public Collection<Pedido> getPedidos(String user) {
		if(user == null) {
			return repo.getAll();
		}else {
			return repo.getPedidosByUser(user);
		}
	}

	@Override
	public Pedido getPedido(Integer id) {
		return null;
	}

}
