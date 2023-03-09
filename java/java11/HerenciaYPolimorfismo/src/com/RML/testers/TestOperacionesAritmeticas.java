package com.RML.testers;


import com.RML.clases.*;

public class TestOperacionesAritmeticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//5. Aqui se llama a la instancia ya que Suma es una clase concreta.
		Suma s = new Suma(5, 10);
		
		//6. Aqui se llama a la referencia ya que OperacionesAritmeticas es una clase abstracta.
		OperacionesArtimeticas ss = new Suma(10, 10);
		
		
		System.out.println("Aqui se llama a la clase concreta Suma: " + s.sumar());
		
		System.out.println("Aqui se llama a la interfaz/abstracta: " + ss.sumar());
	
	Mensajes m = new Suma();
	
	s.mensaje();
	m.mensaje();

	}
}
