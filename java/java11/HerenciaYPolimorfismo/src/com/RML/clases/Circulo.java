package com.RML.clases;




//5. Se crea una sublase Circulo que extiende de la clase padre FigurasGeometricas
public class Circulo extends FigurasGeometricas {

	private int radio;

	
	
	public Circulo(int radio) {
		super("Circulo");
		this.radio = radio;
	}
	
	
	//6. Se redefine el metodo area de la clase padre para el circulo, pero sin alterar al actual objeto de la clase padre, esto se conoce como un polimorfismo dinamico que sin alterar al actual objeto hace una referencia.
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (Math.PI*Math.pow(radio, 2));
	}


	public int getRadio() {
		return radio;
	}


	public void setRadio(int radio) {
		this.radio = radio;
	}
	

	
	
	
	
	
}
