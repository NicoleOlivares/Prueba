package com.ejercicio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.repositories.PelucheRepository;

@Service //en el service se llama al repositorio
public class PelucheService {
	
	//volviendo uno atrás desde repository
	//llamando al repositorio
	//El autowired trae los metodos, las funciones de las clases.(ctrl + click JpaRepository)  
	@Autowired 
	PelucheRepository pelucheRepository;
	
	

}
