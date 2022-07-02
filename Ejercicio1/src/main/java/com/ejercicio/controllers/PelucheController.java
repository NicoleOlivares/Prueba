package com.ejercicio.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	//creando ruta para guardar
	@PostMapping("/guardar")
	public String guardarPeluche(@Valid @ModelAttribute("peluche") Peluche peluche,
			BindingResult resultado, Model model) {
		
		//comprobacion del BindingResult
		if(resultado.hasErrors()) {
			model.addAttribute("msgError", "Ingrese correctamente los datos");
			return "peluche.jsp";
			
		}else {
			//llamado a la base de datos para guardar los datos
			pelucheService.registarPeluche(peluche);//hicimos el llamado de peluche service y luego lo creamos en service. 
			//Haciendo lista para mostrar todos los peluches guardados
			List<Peluche> listaPeluche = pelucheService.findAll();//creamos el metodo en peluche service
			model.addAttribute("pelucheCapturado", listaPeluche);//mostrar la lista en el jsp
			
			return "mostrarPeluche.jsp";
		}
	}
}
