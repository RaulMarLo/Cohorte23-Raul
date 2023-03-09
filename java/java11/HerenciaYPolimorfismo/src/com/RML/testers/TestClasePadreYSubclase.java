package com.RML.testers;

import com.RML.clases.AlumnoSubclase;
import com.RML.clases.PersonaClasePadre;

public class TestClasePadreYSubclase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//7. Se acceden a los atributos desde el main de la subclase y de la clase padre desde la subclase o clase hija ya que se extiende de la clase padre.
		
		AlumnoSubclase a = new AlumnoSubclase(123, 8.5, "Armando", 20);
		//8. Cuando se crea el objeto que tenga herencia, los parametros se reconoceran, en este caso, (string y int) de la clase padre PersonaClasePadre y los parametros de la sublclase, (int y double).	
				
		PersonaClasePadre p = new PersonaClasePadre("Maria", 20);
		
		System.out.println(this.getNombre());
		
	}

}
