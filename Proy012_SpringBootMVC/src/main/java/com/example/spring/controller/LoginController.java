package com.example.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
		model.addAttribute("usuarioForm", new Usuario());
		return"login";
	}
	
	//recogo los datos del form
	//RequestParam para recoger nombre y clave del form
	@PostMapping("/login")
	public String isAHome(
			Model model,
			@ModelAttribute("usuarioForm") @Valid Usuario usuario,
			BindingResult bindingResult)
			{
		
		//ver si paso la validacion
		if(bindingResult.hasErrors()) {
			return"login";
		}
		
		boolean  valido =true;
		//loginService.validaLog(nombre, clave)
		//TODO llamar a un service para que haga la tarea login//trim eliminar espacios//ignorecase comparar mayus y mnus
		if(usuario.getNombre().trim().equalsIgnoreCase("LUSI")) {
			usuario.setRoll("cliente");
		}else {
			usuario.setRoll("admin");
		}
		
		if(valido)model.addAttribute("usuario", usuario);
		
		return "home";
	}
}
