package Ciclos.ForWhileDo;

import java.util.Scanner;

public class UsoDo {
	
	Scanner entradaDo = new Scanner(System.in);
	
	public void cicloDo() {

		int valorDo = 0;
		int acumulador = 0;

		do {

			System.out.println("Introduzca un digito entre cero y nueve.");
			valorDo = entradaDo.nextInt();
			acumulador += valorDo;
			System.out.println("El acumulador es " + acumulador);

		}

		while (valorDo >= 0 && valorDo <= 9);
	}
}
