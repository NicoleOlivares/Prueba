package com.generationprueba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generationprueba.models.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{

}
