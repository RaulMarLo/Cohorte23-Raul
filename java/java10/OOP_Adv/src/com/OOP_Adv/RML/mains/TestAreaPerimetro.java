package com.OOP_Adv.RML.mains;

import com.OOP_Adv.RML.clases.AreaPerimetro;
import com.OOP_Adv.RML.clases.FigurasGeometricas;

public class TestAreaPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AreaPerimetro ap = new AreaPerimetro();
		FigurasGeometricas fg = new FigurasGeometricas();
		
		
		fg.setLado(5);
		
		
		System.out.println("El lado del cuadrado es: " + fg.getLado());
		
		fg.getArea();
		
		System.out.println("El area de un cuadrado es: " + fg.getArea());
		
		
		
	}

}
