package com.RML.clases;

public class Cuadrado extends FigurasGeometricas{

	private int lado;

	public Cuadrado(int lado) {
		
		super("Cuadrado");
		this.lado = lado;
	}
	
	
	//Se implementa el metodo abtracto de FigurasGeometricas "area"
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (lado*lado);//Aqui se define la formula del area del cuadrado.
	}


	public int getLado() {
		return lado;
	}


	public void setLado(int lado) {
		this.lado = lado;
	}
	
	
	
	
}
