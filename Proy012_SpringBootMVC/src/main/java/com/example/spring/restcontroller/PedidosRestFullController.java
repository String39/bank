package com.example.spring.restcontroller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.entidades.Pedido;
import com.example.spring.servicios.PedidosService;


@RestController
public class PedidosRestFullController {
	
	@Autowired
	private PedidosService pedidoService;
		
	//GET ALL
	@GetMapping("/ws/pedidos")
	public Collection<Pedido> all(){
		return pedidoService.getPedidos(null);
	}
	
	//GET BY ID
	@GetMapping("/ws/pedidos/{id}")
	public Optional<Pedido> byId(
			@PathVariable Integer id) {
		
		 return  pedidoService.getPedido(id);	
	}
	
	//INSERT
	//DELETE
	//UPDATE

}
