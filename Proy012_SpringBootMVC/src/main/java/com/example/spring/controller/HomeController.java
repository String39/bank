package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("nombre")
public class HomeController {
	
	@GetMapping("/")
	public String inicio (Model model) {
		model.addAttribute("nombre","Lusi");
		return "home";
	}
}
