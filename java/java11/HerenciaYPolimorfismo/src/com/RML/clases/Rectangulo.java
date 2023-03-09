package com.RML.clases;

import java.util.Scanner;

//3. Se genera una subclase Rectangulo que extiende de la clase Padre FiguaraGeometricas.
public class Rectangulo extends FigurasGeometricas{
	
	private double base;
	private double altura;
	
	
	public Rectangulo(double base, double altura) {
		super("Rectangulo");
		this.base = base;
		this.altura = altura;

	}
	
	
	
	//4.Aqui se le redefine como implementa el metodo area. En ese caso el are de la subclase rectangulo se calculara con base*altura.
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (base*altura);
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	//12. Se implementa la clase abstracta pedirDatos que implementara los datos que el usuario introduzca.
	
	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		
		System.out.println("Introduzca una base: ");
		Scanner datoScanner = new Scanner(System.in);
		double b = datoScanner.nextDouble();
		setBase(b); //13. Se implementa el dato introducido a el set.
		
		
		System.out.println("Introduzca una altura: ");
		Scanner datoScanner2 = new Scanner(System.in);
		double h =datoScanner2.nextDouble();
		setAltura(h);
		
	}
	
}
