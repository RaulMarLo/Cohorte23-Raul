package com.RML.clases;




//1.Con la palabra reservada ""abstract" definimos que es una clase abstracta en ves de una clase concreta.
public abstract class FigurasGeometricas {
	
	
	//2. Se define un metodo abstracto. En un metodo abtracto las llaves son innecesarias ya que esta indefinido, en otra palabras un metodo abstracto carece de un body {}.
	public abstract double area();
	
	
	//7. Para ser una clase abstracta, debe tener al menos un metodo abstracto, una clase abstracta no puede ser instanciada, solo referenciada.
	
	//8. Se crea un metodo concreto, sin embargo al tener el metodo abstracto "area", sigue siendo una clase abstracta.
	private String nombre;


	public FigurasGeometricas(String nombre) {

		this.nombre = nombre;
		
		
		//9. Despues de implementar un metodo concreto a la clase abtracta, las subclases mostrarar un error, con la palabra reservada super() podemos inicializarlo de nuevo como constructor, implementamos super a todas las subclases ya que se agrego una clase concreta a la clase padre.
	}

	public abstract void pedirDatos();
	//

	@Override
	public String toString() {
		return "FigurasGeometricas [nombre=" + nombre + ", area()=" + area() + "]";
	}
	
	
	//11. Se implementa una clase abstracta que pida los datos en la linea 28.
	
	
}
