package com.OOP_Adv.RML.clases;

public class FigurasGeometricas {

	private double perimetro;
	private double lado;
	private double area;
	
	
	//Constructor se llama igual que la clase. Este constructor es un constructos sobrecargado que tiene ya definidos los parametros
	public FigurasGeometricas() {
	
	}


	public FigurasGeometricas(double perimetro, double lado, double area) {
		super();
		this.perimetro = perimetro;
		this.lado = lado;
		this.area = lado * lado;
	}


	public double getPerimetro() {
		return perimetro;
	}


	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}



	
	
	
	
	
	
}
