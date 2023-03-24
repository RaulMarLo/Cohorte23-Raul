package com.generation.cohorte23.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.cohorte23.app.model.Libro;
import com.generation.cohorte23.app.repositories.LibrosRepositorios;

@RestController // 8. Se hace la instancia a traves de anotaciones que es '@Autowired', esto nos ahoora tiempo en vez de definir un nuevo objeto
public class LibroController {

	@Autowired
	LibrosRepositorios lr;

	//10. Se le asigna un mapping para el http
	@RequestMapping("/libros")
	// 9. Se genera el metodo que lista cada metodo del constructor
	public List<Libro> listarTodo() {
		return lr.listarLibro();

	}
}
