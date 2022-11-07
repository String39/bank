package com.example.spring.restcontroller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	
	//{"user":"1","descripcion":"Rosas","fechaPedido":"2022-11-11T12:35:23.307+00:00","entregado":false}
	//INSERT
	@PostMapping("/ws/pedidos")
	public Pedido alta(
			@RequestBody Pedido newPedido) {
		//pedidoService.altaPedido(newPedido);
		Pedido pConId = pedidoService.generarPedido(newPedido);
		return pConId;
	}
	
	
	//DELETE
	@DeleteMapping("/ws/pedidos/{id}")
	public void deleteById(@PathVariable Integer id) {
		pedidoService.borrar(id);
	}
	
	
	//UPDATE
	@PutMapping("/ws/pedidos")
	public Pedido update(@RequestBody Pedido newPedido) {
		//pedidoService.altaPedido(newPedido);
		Pedido pModif = pedidoService.modificar(newPedido);
		return pModif;
	}

}
