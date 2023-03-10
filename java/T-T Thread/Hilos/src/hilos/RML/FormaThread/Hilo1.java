package hilos.RML.FormaThread;

import java.util.Iterator;

public class Hilo1 extends Thread {


	
	//1. Thread es una clase concreta, por esta razon nunca se marca un error de que necesita implementar sus metodos que esta heredando.
	
	
	//2. run es un metodo que esta definido en la clase concreta Thread.
	
	public Hilo1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Se inicializa el thread o hilo " + this.getName());
	
		for (int i = 0; i< 10; i++) {
			
			try {
				
				Thread.sleep(1000);
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
		
		
		//3.Aqui se define el proceso
		
		System.out.println("Se finaliza el thread o hilo " + this.getName());
		
		//4.En este caso se creo el constructor desde la super clase en la linea 12
		
		
		
		
	}
	
	
	
	
}
