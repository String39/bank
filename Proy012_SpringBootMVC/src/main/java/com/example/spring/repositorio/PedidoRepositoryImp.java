package com.example.spring.repositorio;

import java.util.*;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.example.spring.entidades.Pedido;

@Repository
@Qualifier("pedidoRepo")
public class PedidoRepositoryImp implements PedidoRepository{

	private static Logger Log = LoggerFactory.getLogger(PedidoRepositoryImp.class);
	
	private static Map<Integer,Pedido> pedidos = new HashMap<Integer,Pedido>();
	private static int id;
	
	static {
		//añado dos pedidos
		pedidos.put(1, new Pedido(1,"Lusi","Television", new Date(), true));
		pedidos.put(2, new Pedido(2,"Lusi","DVD",new Date(), true));
		pedidos.put(3, new Pedido(3,"Carlos","CD-ROM",new Date(), false));
		id=3;
	}
	
	public PedidoRepositoryImp() {
			Log.info("....instanciando PedidoRepositoryImp");
	}
	
	@Override
	public void add(Pedido pedido) {
		id++;
		pedido.setId(id);
		pedidos.put(id, pedido);
		Log.info("HAs grabado un pedido en la base de datos");	
	}

	@Override
	public Collection<Pedido> getPedidosByUser(String user) {
		Collection<Pedido> lista = new ArrayList<>();
		for (Pedido p :pedidos.values()) {
			if(p.getUser().equals(user)) {
				lista.add(p);
			}
		}
		Log.info(lista.toString());
		return lista;
	}

	@Override
	public Collection<Pedido> getAll() {
		return pedidos.values();
	}

	@Override
	public Pedido getById(Integer id) {
		return pedidos.get(id);
	}

}
