package com.OOP_Adv.RML.mains;

import com.OOP_Adv.RML.clases.Taco;

public class TestTaqueria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Taco t = new Taco();
		
		t.setTipoDeTortilla("Tortilla Azul, ");
		t.setGuisado("Chicharron en salsa verde, ");
		t.setNumeroDeTortillas(2);
		t.setTamaĆ±oDeTortilla("Tortilla Grande, ");
		t.setPrecio(25);
		
		
		t.preparar();
		t.vender();
		t.subirPrecio();
		
		
		
	}

}
