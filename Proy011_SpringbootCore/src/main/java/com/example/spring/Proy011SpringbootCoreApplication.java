package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.spring.entidades.Pedido;
import com.example.spring.servicios.PedidosService;

@SpringBootApplication
public class Proy011SpringbootCoreApplication implements CommandLineRunner{

	@Autowired
	private PedidosService service;
	
//	@Autowired
//	private PedidosService service2;
	
	public static void main(String[] args) {
		SpringApplication.run(Proy011SpringbootCoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service.generarPedido(new Pedido());
	}

	
}
