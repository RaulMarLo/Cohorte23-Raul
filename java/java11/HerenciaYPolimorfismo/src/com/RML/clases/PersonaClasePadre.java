package com.RML.clases;


//Se inicializa la clase padre.

public class PersonaClasePadre {

	private String nombre;
	private int edad;
	
	
	//2. Se crea el constructor de la clase padre.
	
	public PersonaClasePadre(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}


	//3. Se crean los getters y setters de la clase padre.
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	
	
	@Override
	public String toString() {
		return "PersonaClasePadre [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
	
	
	
	
	
}
