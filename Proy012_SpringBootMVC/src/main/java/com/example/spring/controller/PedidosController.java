package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.spring.entidades.Pedido;
import com.example.spring.servicios.PedidosService;

@Controller
public class PedidosController {

	@Autowired
	private PedidosService pedidoService;
	
	@GetMapping("/pedidos")
	public String pedidos(Model model) {
		pedidoService.generarPedido(new Pedido());
		return "pedidos";
	}
}
