package com.RML.clases;


//2. Se define que la clase implementara la interfaz OperacionesAritmeticas.
public class Suma implements OperacionesArtimeticas, Mensajes {

	
	private double Valor1;
	private double Valor2;
	
	
	public void mensajeSuma() {
		System.out.println("Hola soy una suma.");
	}
	
	//4. Se implementa el metodo constructor.
	public Suma(double valor1, double valor2) {
		super();
		Valor1 = valor1;
		Valor2 = valor2;
	}

	
	
	
	
	public Suma() {
		// TODO Auto-generated constructor stub
	}

	//3. Se implementan los metodos abstractos sumar y restar.
	@Override
	public double sumar() {
		// TODO Auto-generated method stub
		return (Valor1+Valor2);
		
	}
	
	@Override
	public double restar() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
		
	}
	

