package Ciclos.Control;

import java.util.Scanner;

import Ciclos.ForWhileDo.UsoDo;
import Ciclos.ForWhileDo.UsoFor;
import Ciclos.ForWhileDo.UsoWhile;

public class DoSwitch {

	public void controlador() {
		
		
		Scanner s = new Scanner(System.in);
		Menus mp = new Menus();
		UsoWhile ObjetoUW = new UsoWhile();
		UsoFor ObjetoUsoFor =new UsoFor();
		UsoDo ObjetoDo = new UsoDo();
		
		int opcion = 0;
				
		do {
			mp.menuPrincipal();
			System.out.println("Introduzca una opción:");
			opcion = s.nextInt();
			
			switch (opcion) {
			case 1:
				ObjetoUW.cicloW();
				break;
				
			case 2:
				ObjetoUW.centinelaW();
				break;
				
			case 3:
				ObjetoUW.banderaW();
				break;
				
			case 4:
				ObjetoUsoFor.cicloFor();
				break;
				
			case 5:
				ObjetoUsoFor.letrasfor();
				break;
				
			case 6:
				ObjetoDo.cicloDo();
				break;
				

			default:
				break;
			}
			
			
			
			
		} while (opcion <7 && opcion >=1);
		System.out.println("Saliste del menu.");
		
	}

}
