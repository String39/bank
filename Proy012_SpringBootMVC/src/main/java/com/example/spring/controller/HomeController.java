package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String inicio (Model model) {
		model.addAttribute("nombre","Luis Ramos");
		return "home";
	}
}
