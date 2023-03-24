package com.generation.cohorte23.app.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.generation.cohorte23.app.model.Libro;

//(Continuacion de model) 6.Definimos a la clase como '@Repository'
@Repository
public class LibrosRepositorios {

	//7. Asignamos el metodo 'listar' que usa colecciones de List<Libro>
	public List<Libro> listarLibro() {
		List<Libro> lista = new ArrayList<Libro>();
		lista.add(new Libro("Spring Boot", "Luis", "1"));
		lista.add(new Libro("Java", "Pedro", "2"));
		lista.add(new Libro("C", "Richard", "3"));
		return lista;
	}
}
