package com.ejercicio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejercicio.models.Peluche;

@Repository                                         //obejeto y tipo de dato id
public interface PelucheRepository extends JpaRepository<Peluche, Long>{//necesitamos extenderlos porque el nieto nos permite hacer listas
	
	//volvemos para atrás hacia service
	
	

}
