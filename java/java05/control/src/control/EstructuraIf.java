package control;

import java.util.Scanner;

public class EstructuraIf {
	Scanner entrada = new Scanner(System.in);//Scanner nos permites solicitar objetos por medio del teclado, un tipo prompt html cuando se usa el navegador.
	
	public void controlIf() {
		// TODO Auto-generated method stub
		
		/*int// tipo primitive*/ 
		
		long nota = 6;
		if (nota>5) {
			System.out.println("Nota aprobada " + nota +".");
		}
		System.out.println("Continua con el control de flujo.");
		
		if (nota>=5) {
			System.out.println("Nota aprobada: " + nota + ".");
			}
			else {
				System.out.println("Nota no aprobada: " + nota + ".");
		}
	}
	
	
	public void divisible() {
		// TODO Auto-generated method stub
		System.out.println("Introduzco el primer número: ");
		int Num1 = entrada.nextInt();
		System.out.println("Introduzca un segundo número: ");
		int Num2 = entrada.nextInt();
		
		if (Num1%Num2 == 0) {
			System.out.println("El numero " + Num1 + " es divisible en enteros entre " + Num2 + ", el residuo de " + Num1 + " entre " + Num2 + " es: " + Num1%Num2);	
		}
		else {
		System.out.println("El número " + Num1 + " no es divsible en enteros entre " + Num2);
		}
	}
	
	
	public void compara() {
		/*for (int i = 0; i < 5; i++)*/ {
			
		System.out.println("Introduzca el primer número: ");
		int Num3 = entrada.nextInt();
		System.out.println("Introduzca un segundo número: ");
		int Num4 = entrada.nextInt();
		
		if(Num3==Num4) {
			System.out.println("El número " + Num3 + " es igual a el número " + Num4 + ".");
		}
		else if (Num3>Num4) {System.out.println("El número " + Num3 + " es mayor a el número " + Num4 + ".");
			
		}
		else if (Num3<Num4) {System.out.println("El número " + Num3 + " es menor a el número " + Num4 + ".");
		
		}
		else {
			System.out.println("El número " + Num3 + " es diferente a el número " + Num4 + ".");
		}
	}
	}
	
	public void menorMayorIgualA0() {
		for (int i = 0; i < 5; i++) {
		System.out.println("Introduzca un número: ");
		int Num5 = entrada.nextInt();
		
		if(Num5<0) {
			System.out.println("El número " + Num5 + " es menor a " + 0 + ".");}
		else if (Num5==0) {
				System.out.println("El número " + Num5 + " es igual a " + 0 + ".");}
		else if (Num5>0) {
			System.out.println("El número " + Num5 + " es mayor a " + 0 + ".");}
		}
	}


public static int CheckNumber (){
    
    Scanner UserInputNum = new Scanner(System.in);
    
     System.out.println("Introduce number: ");
     int n1 = UserInputNum.nextInt();
     
     if (n1%2==0 || (n1%2 == 0 && (n1>=6 || n1 <= 20 ))){
          System.out.print("Weird");
          
          return n1;}
         
         else if ((n1 >= 2 || n1 <= 5) || n1 > 20){ 
         System.out.println("Not Weird");
         
         return n1;}
     
      return n1;
}
}