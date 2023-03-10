package hilos.RML.pruebas;

import hilos.RML.FormaThread.Hilo1;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread h1 = new Hilo1("Juan");
		h1.start();
		
		Thread h2 = new Hilo1("Maria");
		h2.start();
		
		Thread h3 = new Hilo1("Raul");
		h3.start();
		
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//5.Se crea una instancia.
		System.out.println(h1.getState());
		
		//6.getState() en el syso retornara NEW ya que este proceso nuevo acaba de asignar a la memoria.
		
		//7.Se inicializa el h1, en otras palabras todos los metodos de Hilo1.
		
		//8.Se llama a un metodo sleep en la linea 14, returna TERMINATED despues de los milisegundos establecidos.
	}

}
