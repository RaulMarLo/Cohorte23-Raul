package com.RML.testers;

import com.RML.clases.*;

public class TestFigurasGeometricas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Cuando se usa el polimorfismo se le conoce como "REFERENCIA" cuando se llama a una clase y/o metodo, al contrario de una instancia en una clase sin polimorfismo o herencia.
		
		Rectangulo rectangulo = new Rectangulo(10, 2);
		FigurasGeometricas circulo = new Circulo(2);
		System.out.println(rectangulo.area());
		System.out.println(circulo.area());
		
		
		//Ejercicio, crear clase de un cuadrado y una clase de un triangulo que extienda de la clase padre FigurasGeometricas e implementar el metodo abstracto area que se define en la clase padre.
		
		Cuadrado cuadrado = new Cuadrado(6);
		System.out.println(cuadrado.area());
		
		Triangulo triangulo = new Triangulo(3, 6);
		System.out.println(triangulo.area());
		
		
		//10. Desoues de implementar el metodo concreto a la clase padre e implementar el super() podremos implementar el metodo concreto.
		
		System.out.println(rectangulo.toString());
		
		
		//13. Se implementa el metodo pedirDatos en la linea 31
		rectangulo.pedirDatos();
		System.out.println(rectangulo.toString());
		
		
		
	}

}
