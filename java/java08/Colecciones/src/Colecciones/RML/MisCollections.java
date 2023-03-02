package Colecciones.RML;

public class MisCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		wrapperClass();
	}
	
	//UNA COLECCION UTILIZA CLASES QUE POTENCIALIZA A LOS ARREGLOS.
	
	//Se declara el metodo WrapperClass
	static void wrapperClass() {
		// byte, short, long, int, float, double, char
		
		byte numeroB = 12;
		System.out.println("Tamaño de un byte " + Byte.SIZE);
		System.out.println("Valor Max de un byte es " + Byte.MAX_VALUE);
		System.out.println("Valor Min de byte es " + Byte.MIN_VALUE);
		//Se llama a las propiedades de el tipo Byte, en este caso usamos SIZE y MAX VALUE

		System.out.println("--->" + numeroB);
		
		System.out.println("Tamaño de un entero " + Integer.SIZE);
		System.out.println("Valor Max de un entero es " + Integer.MAX_VALUE);
		System.out.println("Valor Min de byte es " + Integer.MIN_VALUE);
		
		System.out.println("Tamaño de un short " + Short.SIZE);
		System.out.println("Valor Max de un short es " + Short.MAX_VALUE);
		System.out.println("Valor Min un short es " + Short.MIN_VALUE);

		System.out.println("Tamaño de un long " + Long.SIZE);
		System.out.println("Valor Max de un long es " + Long.MAX_VALUE);
		System.out.println("Valor Min un long es " + Long.MIN_VALUE);
		
		long NumeroLong = -922337203685477580l;
		

	}
	
	
}
