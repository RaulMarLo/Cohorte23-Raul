package hilos.RML.FormaRunnable;

import java.util.Iterator;

//1. Se implementa la clase Hilo2 a la interfaz Runnable.
public class Hilo2 implements Runnable {
	
	//2.Se declara el string nombre
private String nombre;
	
	
public Hilo2(String nombre) {
	// TODO Auto-generated constructor stub
	this.nombre = nombre;
}
	
	//3. Se crean los get y sets
	
	public String getNombre() {
	return nombre;
}




	//4. Se llama el metodo run que esta declarado en la interfaz Runnable sin embargo es un metodo abstracto.

	@Override
		public void run() {
			// TODO Auto-generated method stub
			
		System.out.println("Inicio del thread " + this.getNombre());
		
		
		for (int i = 0; i< 10; i++){
			
			System.out.println(i + " " + nombre);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
		}
		
	
	
	}