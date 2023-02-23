class HolaMundo{
	public static void main(String [] ch23){
		System.out.println("Hola mundo desde Java");

		Saludo objSaludo; //Se crea el objeto Saludo
		objSaludo = new Saludo();
		objSaludo.saludar();//se accede al metodo dentro del objeto, en este caso metodo saludar que se encuentra en el objeto Saludo
		
	}
}