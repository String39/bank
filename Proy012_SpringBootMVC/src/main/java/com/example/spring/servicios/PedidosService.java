package com.example.spring.servicios;

import java.util.Collection;
import java.util.Optional;

import com.example.spring.entidades.Pedido;

public interface PedidosService {
	Pedido generarPedido(Pedido p);
	Collection<Pedido> getPedidos(String user);
	Optional<Pedido> getPedido(Integer id);
	
	Pedido altaPedido(Pedido p);
	
	Pedido modificar (Pedido p);
	void borrar(Integer id);
}
