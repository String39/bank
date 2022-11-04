package com.example.spring.controller;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		//Usuario usr = (Usuario) model.getAttribute("usuario");
		Collection<Pedido> lista = pedidoService.getPedidos(null);
		model.addAttribute("listaPedidos", lista);
		return "pedidos";
	}
	
	
	//localhost:8080/pedidos/Lusi
	@GetMapping("/pedidos/{username}")
	public String pedidosCliente(
			Model model,
			@PathVariable("username") String name) {
		//pedir la lista de pedidos del usuario
		Collection<Pedido> lista = pedidoService.getPedidos(name);
		model.addAttribute("listaPedidos", lista);
		return "pedidos";
	}
	
	@GetMapping("/pedido")
	public String verDetallePedido(Model model,
			@RequestParam("idPedido") Optional<Integer> id) {
		
		//hemos declarado opcional el id
		//orElse (alternativa) sino aparece devuelve null, en el caso de que no te pase ningu id
		Integer idPedido = id.orElse(null);
		
		if(id.isEmpty()) {
			return "redirect:/pedidos";
		}
		
		//System.out.println(idCliente);
		Pedido p = pedidoService.getPedido(idPedido).get();
		model.addAttribute("pedido", p);
		
		return "detalle-pedido";
	}
	
	@GetMapping("/alta")
	public String altaPedido(Model model) {
		model.addAttribute("altaForm", new Pedido());
		return "alta-pedido";
	}
	
	@PostMapping("/alta")
	public String altaPedido(Model model,
			@ModelAttribute("altaForm") Pedido pedido, 
			BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "alta-pedido";
			
		}
		
		Usuario u = (Usuario) model.getAttribute("usuario");
		pedido.setUser(u.getNombre());
		Pedido p = pedidoService.altaPedido(pedido);
		model.addAttribute("pedido", p);
			return "detalle-pedido";
	}
	
	//pedir?desc=zapato&cantidad=56
	@GetMapping("/pedir")
	public String hacerPedido(
			@RequestParam String desc,
			@RequestParam int cantidad) {
		
		//no hay contexto transaccional de bd
		//no se ha iniciado ninguna transaccion todavia
		Pedido p = new Pedido();
		p.setDescripcion(desc);
		p.setFechaPedido(new Date());
		this.pedidoService.generarPedido(p);
		return "redirect:/pedidos";
	}
}
