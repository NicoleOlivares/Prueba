package com.generationprueba.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generationprueba.models.Curso;
import com.generationprueba.services.CursoService;

@Controller
@RequestMapping("/curso")
public class CursoController {
	@Autowired
	CursoService cursoService;

	@RequestMapping("")
	public String inicio(@ModelAttribute("curso") Curso curso) {

		return "curso.jsp";
	}

	// guardando curso
	@PostMapping("/guardar")
	public String guardarCurso(@Valid @ModelAttribute("curso") Curso curso, BindingResult resultado, Model model) {

		if (resultado.hasErrors()) {
			model.addAttribute("msgError", "Datos erroneos");
			return "curso.jsp";
		} else {
			// enviamos el obeto a persistir en base datos
			cursoService.guardarCurso(curso);
			// obtener una lista de cursos
			List<Curso> listaCursos = cursoService.findAll();
			// pasamos la lista de cursos al jsp
			model.addAttribute("cursosCapturados", listaCursos);
			return "mostrarCursos.jsp";
		}

	}

	// mostrando curso
	@RequestMapping("/mostrar") // ruta
	public String mostrar(Model model) {
		// obtener un alista de cursos
		List<Curso> listaCursos = cursoService.findAll();
		// pasamos la lista de cursos al jsp
		model.addAttribute("cursosCapturados", listaCursos);
		return "mostrarCursos.jsp";
	}

	// Editando un curso
	// capturando dato para editarlo
	@RequestMapping("/editar/{id}")
	public String editar(@PathVariable("id") Long id, Model model) {// pasamos informacion al jsp
		System.out.println("el id es: " + id);
		Curso curso = cursoService.buscarId(id);
		model.addAttribute("curso", curso);// pasar el curso al jsp

		return "editarCurso.jsp";// redireccionar a otra url o path

	}

	// actualizando un curso

	@PostMapping("/actualizar/{id}")
	public String actualizarCurso(@PathVariable("id") Long id, @Valid @ModelAttribute("curso") Curso curso,
			BindingResult resultado, Model model) {

		System.out.println("el id al actualizar es: " + id + " getId " + curso.getId());

		if (resultado.hasErrors()) {
			model.addAttribute("msgError", "Datos erroneos");
			return "editarCurso.jsp";
		} else {
			curso.setId(id); // agregar el id al objeto

			// enviamos el obeto a persistir en base datos
			cursoService.guardarCurso(curso);
			// obtener una lista de cursos
			List<Curso> listaCursos = cursoService.findAll();
			// pasamos la lista de cursos al jsp
			model.addAttribute("cursosCapturados", listaCursos);
			return "mostrarCursos.jsp";

		}

	}

}
