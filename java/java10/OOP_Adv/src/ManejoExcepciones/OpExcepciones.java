package ManejoExcepciones;

public class OpExcepciones extends Exception{


	//2. Se le dice en esta clase opcionesExcepciones que se herede esa excepcion. Se le asigna el tipo de la clase, o tipo generalizada, etc.

	//3. Se extende o hereda la clase Exceptions a la clase OpExcepeciones.

	//4. Como se le manda el mensaje que el denomindador es 0 y es un error? Se genera el constructor de esta clase.

	
	public OpExcepciones(String msj) {
		// TODO Auto-generated constructor stub
		
		super(msj); //5. Se le dice al constructor que tipo de error se ha generado. Cundo reconoce el error puede controlar los mensajes
	}
	
	
	
	

}

	
	
	
	

