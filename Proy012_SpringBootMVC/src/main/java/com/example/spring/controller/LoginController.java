package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.spring.entidades.Usuario;

@Controller
@SessionAttributes("usuario")
public class LoginController {
	
	
//	@Autowired
//	private LoginService loginService;
	
	//formulario en el que pido usuario y clave
	@GetMapping("/login")
	public String loginPage(Model model) {
		model.addAttribute("usuario", new Usuario());
		return"login";
	}
	
	//recogo los datos del form
	//RequestParam para recoger nombre y clave del form
	@PostMapping("/login")
	public String isAHome(
			Model model,
			@ModelAttribute("usuario") Usuario usuario)
			{
		//boolean  valido = loginService.validaLog(nombre, clave)
		
		usuario.setRoll("cliente");
		return "home";
		//return "login"
	}
}
