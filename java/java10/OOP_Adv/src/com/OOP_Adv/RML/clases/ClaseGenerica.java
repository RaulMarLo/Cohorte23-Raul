package com.OOP_Adv.RML.clases;

public class ClaseGenerica <T> {
	T obj;
	
	
	public ClaseGenerica(T obj) {
		
		this.obj = obj;
		
	}
	
	
	public void claseTipo() {
		
		
		
		System.out.println("T es un tipo de dato: " + obj.getClass());
	}
	
	
}
