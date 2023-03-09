package com.RML.clases;


//4. Se crea la subclase que se extiende de la clase padre PersonaClasePadre

public class AlumnoSubclase extends PersonaClasePadre{

	private int matriculas;
	private double promedio;
	
	//5. Se crea el constructor de la subclase, cuando se construye, este hereda los atributos de la clase padre PersonaClasePadre
	
	public AlumnoSubclase(String nombre, int edad, int matriculas, double promedio) {
		super(nombre, edad);
		this.matriculas = matriculas;
		this.promedio = promedio;
	}

	//6. Se crea los gets y sets de la subvlase, los gets y sets de la clase padre se usaran desde su clase prinicpal PersonaClasePadre.
	
	public int getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(int matriculas) {
		this.matriculas = matriculas;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		return "AlumnoSubclase [matriculas=" + matriculas + ", promedio=" + promedio + "]";
	}

	//9.Se crea un metodo que el main accedera.
	
public void mostrarDatos() {
	
	System.out.println(this.getNombre() + " " + this.getEdad() + " " + this.matriculas + " " + this.promedio);
	
}


//10.AQUI SE DEFINE EL POLIMORFISMO, ya que el metodo tiene el mismo nombre pero acepta diferentes parametros y se reescribe.
public void mostrarDatos(String apellido) {
	System.out.println(this.getNombre() + " " + apellido + " " + this.getEdad() + " " + this.matriculas + " " + this.promedio);
}
	
	
	
	
}
