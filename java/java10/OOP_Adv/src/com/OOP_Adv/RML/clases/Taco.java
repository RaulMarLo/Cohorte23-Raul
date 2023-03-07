package com.OOP_Adv.RML.clases;

public class Taco {
	
	private String tipoDeTortilla;
	private String guisado;
	private int numeroDeTortillas;
	private String tamañoDeTortilla;
	private float Precio;
	
	
	public Taco(String tipoDeTortilla, String guisado, int numeroDeTortillas, String tamañoDeTortilla,
			float precio) {
		
		this.tipoDeTortilla = tipoDeTortilla;
		this.guisado = guisado;
		this.numeroDeTortillas = numeroDeTortillas;
		this.tamañoDeTortilla = tamañoDeTortilla;
		Precio = precio;
	}


	public Taco() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void preparar() {
		
		System.out.println(getNumeroDeTortillas() + " " +  getTipoDeTortilla() + getTamañoDeTortilla() + getGuisado());
	}
	
	public void vender() {
		
		System.out.println("El precio del taco de " + getGuisado() + "es de " + getPrecio() + " pesos.");
	}
	
	public void subirPrecio() {
		
		
		System.out.println("Como la inflacion esta dura, se le sube el 10% del precio original.");
		
	}


	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}


	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}


	public String getGuisado() {
		return guisado;
	}


	public void setGuisado(String guisado) {
		this.guisado = guisado;
	}


	public int getNumeroDeTortillas() {
		return numeroDeTortillas;
	}


	public void setNumeroDeTortillas(int numeroDeTortillas) {
		this.numeroDeTortillas = numeroDeTortillas;
	}


	public String getTamañoDeTortilla() {
		return tamañoDeTortilla;
	}


	public void setTamañoDeTortilla(String tamañoDeTortilla) {
		this.tamañoDeTortilla = tamañoDeTortilla;
	}


	public float getPrecio() {
		return Precio;
	}


	public void setPrecio(float precio) {
		Precio = precio;
	}
	
	
	
	
	
}
