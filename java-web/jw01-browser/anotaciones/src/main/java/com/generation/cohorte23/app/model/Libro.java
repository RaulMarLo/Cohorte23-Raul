package com.generation.cohorte23.app.model;

//Al modelo tambien se le conoce como bean o POJO ('Plain Old Java Object')
public class Libro {
	
	private String titulo;
	private String autor;
	private String isbn;
	
	
	//2. Creamos un constructor plano
	public Libro() {
		// TODO Auto-generated constructor stub
	}
	
	
	//3. Creamos un constructor sobrecargado
	public Libro(String titulo, String autor, String isbn) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
	}

	//4. Creamos gets y sets de los strings asignados
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	


}
