package com.example.spring.servicios;

import java.util.Collection;
import java.util.Optional;

import com.example.spring.entidades.Pedido;

public interface PedidosService {
	void generarPedido(Pedido p);
	Collection<Pedido> getPedidos(String user);
	Optional<Pedido> getPedido(Integer id);
	
	Pedido altaPedido(Pedido p);
}
