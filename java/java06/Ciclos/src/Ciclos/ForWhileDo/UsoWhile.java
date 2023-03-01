package Ciclos.ForWhileDo;

import java.util.Scanner;

public class UsoWhile {

	Scanner entrada = new Scanner(System.in);

	public void cicloW() {
		// TODO Auto-generated method stub
		int iterador = 0; // Se define el iterador que realizara el bucle.
		while (iterador < 10)
			;
		{

			System.out.println("Iterador " + iterador);
			iterador = iterador + 1;// Redefine el valor del iterador, esto hasta que el iterador sea menor a 10.
		}
	}

	// While uso centinela.
	public void centinelaW() {
		final int centinela = -1; // final int se refiere a que el valor seguira siendo el mismo en todo momento,
									// evitara que se modifique, en otras palabras es una variable que se vuelve
									// constante.

		System.out.println("Introduzca una calificaión: ");
		int calificación = entrada.nextInt();
		while (calificación != centinela) {

			System.out.println("La calificación es: " + calificación);

			System.out.println("Introduzca una calificaión: ");
			calificación = entrada.nextInt();
		}
	}

	public void banderaW() {
		
		boolean valorb = false;
		while (!valorb) {
			System.out.println("Introduzca un valor numerico: ");
			int valorx = entrada.nextInt();
			if (valorx>0 && valorx<5){
				int potaxio = (int) Math.pow(valorx, 2);
				System.out.println(potaxio + " esta entre el rango de 0 y 1 y 4.");
			}
			
			else {
				valorb = true;
				System.out.println("Esta variable esta fuera del rango de 1 y 4.");
			}
			
		}
		}

}
