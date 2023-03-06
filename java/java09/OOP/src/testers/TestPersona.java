package testers;

import OOP.clases.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p = new Persona();
		p.setNombre("Maria");
		System.out.println("---> " + p.getNombre());
		p.setEdad(26);
		System.out.println("Edad de " + p.getNombre() + " " + p.getEdad());
		
		
		
		
	}

}
