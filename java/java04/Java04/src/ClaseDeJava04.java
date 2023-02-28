
public class ClaseDeJava04 {
	public static void main(String[] args) {
	
	/*public static void main(String )

	int edad = 18;
	boolean tieneLicencia = true;
	
	if (edad >= 18 && tieneLicencia) {
	    System.out.println("Puede conducir un coche");
	} else {
	    System.out.println("No puede conducir un coche");*/
		
	
	//Ejercicio1; Verificar si un número es par y positivo:
		
	int Num1 = 6;
	int Num2 = 2;
	int Num3 = Num1%Num2;

	boolean ResultadoNumPositivoYPar = (Num1>0 && Num3 == 0);
	
	if (ResultadoNumPositivoYPar){
		System.out.println(Num1 + " es positivo y par.");
	}
	
	else {
	
	System.out.println(Num1 + " no es positivo o no es par.");
	}
	
	
	//Ejercicio2; Verificar si un número está dentro de un rango específico
	
	double NumADefinir = 11;
	double NumMinimo = 0;
	double NumMaximo = 10;
	
	boolean NumEntreRango = (NumMinimo<NumADefinir && NumMaximo>NumADefinir );
	boolean NumFueraRango = (NumMinimo>NumADefinir|| NumMaximo<NumADefinir);
	
	if (NumEntreRango) {
		System.out.println("El numero " + NumADefinir + " esta dentro del rango de " + NumMinimo + " y " + NumMaximo + ".");}
	
	else {System.out.println("El numero " + NumADefinir + " esta fuera del rango de " + NumMinimo + " y " + NumMaximo + ".");
		}
	
	
	//Ejercicio3; Verificar si una cadena es igual a otra o no.
	
	String cadena1 = "Hola";
	String cadena2 = "hola";
	
	boolean Res = (cadena1==cadena2);
	
	if(Res) {
		System.out.println(cadena1 + " es igual a " + cadena2 + ".");
	}
	else {
		System.out.println(cadena1 + " es diferente a " + cadena2 + ".");
	}
	
	}
}