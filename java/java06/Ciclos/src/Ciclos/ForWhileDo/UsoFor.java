package Ciclos.ForWhileDo;

public class UsoFor {
	public void cicloFor() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("El iterador es: " + i);			
		}
	}
	
	
	public void letrasfor() {
		
		for (int i = 'A'; i < 'z'; i++) {
			//char letra = (char)i; syso(letra) se convierte el codigo ascii a letra.
			System.out.println("El iterador es " + i + " que en letra es " + Character.toString(i) + ".");
		}
		
	}
}
