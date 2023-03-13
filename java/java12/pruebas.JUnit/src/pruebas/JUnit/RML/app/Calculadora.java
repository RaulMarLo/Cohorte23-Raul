package pruebas.JUnit.RML.app;

import org.junit.jupiter.api.Test;

public class Calculadora {

	
	//1. Creamos metodos de prueba de calculadora
	
	public int sumar(int n1, int n2) {
		
		//11. Definimos los parametros que se uasaran en el metodo sumar que seran does enteros llamados n1 y n2
		
		
		
		return (n1+n2);
	}
	
	
	
	public int restar(int n1, int n2) {
		
		
		//12. Definimos los parametros que se uasaran en el metodo restar que seran does enteros llamados n1 y n2
		
		return (n1-n2) ;
	}
	
	//13. Declaramos los parametros n1 y n2 dentro de los metodos "(int n1, int n2)"
	
	
	public double division(double n1, double n2) {
		
		return (n1/n2);
		
	}
	
	public double divisionEntreZero(double n1, double n2) {
		
		if (n2 == 0){
			
			throw new ArithmeticException("****** Un numero divido entre cero es indefinido o infinito ******");
		}
		return (n1/n2);
	}
}
