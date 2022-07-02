package com.ejercicio.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.models.Peluche;
import com.ejercicio.repositories.PelucheRepository;

@Service //en el service se llama al repositorio
public class PelucheService {
	
	//volviendo uno atrás desde repository
	//llamando al repositorio
	//El autowired trae los metodos, las funciones de las clases.(ctrl + click JpaRepository)  
	@Autowired 
	PelucheRepository pelucheRepository;

	public void registarPeluche(@Valid Peluche peluche) {
		// guardando peluche en la base de datos
		pelucheRepository.save(peluche);
		
	}

	public List<Peluche> findAll() {
		// Retornando lista con datos ingresados para ser mostrada en el jsp
		return pelucheRepository.findAll();
	}
	
	

}
