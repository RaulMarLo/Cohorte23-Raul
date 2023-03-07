package testers;

import OOP.clases.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fecha f = new Fecha();
		f.setDia(6);
		f.setMes(3);
		f.setAño(2023);
		f.setHora(16.16);
		
		
		System.out.println(f.stringFecha());
		System.out.println(f);
		System.out.println(toString(f.stringFecha()));
		
		
	}

}
