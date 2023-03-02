package Funciones;

public class Funciones {


		
	public static int sumar (int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}
	
	
	//Funcion para imprimir asteriscos (void)
	public static void imprimirAsteriscos() {
		System.out.println("****************");
	}
	//Cierre imprimir objetos
	
	public static double calculadora (int Num1, int Num2) {
		
		double resultadoCalculadora = (double) Num1 + Num2;
		return resultadoCalculadora;
	}
	
	//Este metodo tiene como funcion ejecutar cosas.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("El resultado de la suma es: " + sumar(5,8));
		
		imprimirAsteriscos();
		
		
		
		double valorEjemplo = 1.234567;
		
		System.out.println("La raiz cuadrada de " + valorEjemplo + " es " + Math.sqrt(valorEjemplo));
		
		altura();

	} 
	
	
	public static double altura () {
		
		double distancia = 100;
		double angulos = 30;
		
		double angulosARadianes = (Math.toRadians(30));
		
		double alturaTorre = distancia*angulosARadianes;
		
		System.out.println(alturaTorre);
		System.out.println(distancia);
		return alturaTorre;
		
	}
}
	
	







/*Funciones:

-Que no retornan valores
-Si rretornan valores.abstract


Funciones != Metodos



//Java es un lenguaje que esta orientado a objetos, mientras javascript es un script orientado a objetos.


Sintaxis de las funciones que si retornan valores tipoDeRetorno nombreDeLaFuncion(tipDeDato argumento1, tipoDeDato argumento2, ...)
*/