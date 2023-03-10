package hilos.RML.pruebas;

import hilos.RML.FormaRunnable.Hilo2;

public class TestRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//5. Llamamos a la referencia de Hilo2 ya que implementa una interfaz..
		Hilo2 ht = new Hilo2("Pedro");
		
		//6. Definimos un nuevo objeto "st" que usa el anterior objeto "ht".
		Thread st = new Thread(ht);
		
		
		//7. Se ejecutan las instancias que se definieron en Hilo1 con lo atributos de Hilo2.
		new Thread(new Hilo2("Canicula")).start();;
		new Thread(new Hilo2("MAriano")).start();
		
	}

}
