package ManejoExcepciones;

public class TestExcepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//6. Se crea un try catch que capturara las excepciones
		
		
		try {
			Division d = new Division(4,2);
		} 
		
		//7.printStackTrace se usa para imprimir las excepciones que se estan ejecutando.
		
		catch (OpExcepciones e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("Continuamos...");
		
	}

}
