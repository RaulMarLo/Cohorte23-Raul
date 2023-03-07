package com.OOP_Adv.RML.mains;

import java.util.*;

public class TestColecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// <> Operador diamante, define a que tipo de dato encapsula y podra utilizar. En el primer caso si definimos <String>, los valores que sean numeros traeran un error.
		
		ArrayList <String> coleccionTest = new ArrayList<String>();
		coleccionTest.add("Esto es una coleccion: ");
		//coleccionTest.add(13);
		coleccionTest.add(15.15 + " ");
		coleccionTest.add("fin de la coleccion.");
		
		
		for (int i = 0; i < coleccionTest.size(); i++) {
		
			
			System.out.println(coleccionTest.get(i));
			
	}
		
		System.out.println(coleccionTest);

}
	
}
