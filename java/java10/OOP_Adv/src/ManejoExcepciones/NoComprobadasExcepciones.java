package ManejoExcepciones;

import java.util.Scanner;

public class NoComprobadasExcepciones {

	public static void main(String[] args) {
		
		System.out.println("Introduzca un valor: ");
		Scanner datoScanner = new Scanner(System.in);
		
		
		
		try {
			double divisor;
			divisor = Double.parseDouble(datoScanner.next());
			double division = 10/divisor;
			System.out.println("-->" + division);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Capturando la excepcion: " + e.getMessage());
			
		} catch (NumberFormatException nfe) {
			// TODO: handle exception
			System.out.println("El dato es un caracter " + nfe.getMessage());
			
		} finally {
			System.out.println("Este bloque se va a ejecutar con o sin la excepcion.");
		}
		
		System.out.println("Continuamos con el flujo de la aplicacion");
		
		}
		
		
		
	}
	
