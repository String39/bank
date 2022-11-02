package com.example.spring.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.spring.entidades.Pedido;
import com.example.spring.entidades.Usuario;
import com.example.spring.servicios.PedidosService;

@Controller
@SessionAttributes("usuario")
public class PedidosController {

	@Autowired
	private PedidosService pedidoService;
	
	@GetMapping("/pedidos")
	public String pedidos(Model model) {
		//pedidoService.generarPedido(new Pedido());
		Usuario usr = (Usuario) model.getAttribute("usuario");
		Collection<Pedido> lista = pedidoService.getPedidos(usr.getNombre());
		model.addAttribute("listaPedidos", lista);
		return "pedidos";
	}
}
