package com.ejercicio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ejercicio.models.Peluche;
import com.ejercicio.services.PelucheService;

@Controller
@RequestMapping("/peluche")
public class PelucheController {
	
	//Volviendo uno atrás de service
	//haciendo llamados de los metodos de service
	@Autowired
	PelucheService pelucheService;
	
	@RequestMapping("")
	public String inicio(@ModelAttribute("peluche") Peluche peluche) {
		
		return "peluche.jsp";
	}
	
	
	
	

}
