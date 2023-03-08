package ManejoExcepciones;



public class Division {
	
	private double numerador;
	private double denominador;
	
	
	//1 Se generan los atributos de division y se genera el constructor Division.
	
	public Division(double numerador, double denominador) throws OpExcepciones {
		
		
		if (denominador == 0) {
			
			throw new OpExcepciones("El denominador es un cero");
		}
		
		this.numerador = numerador;
		this.denominador = denominador;
	
	}
	
	public void visualizar() {
	System.out.println("El resultado de la division es: " + (this.numerador/this.denominador));
	}
		
		
	}
		


