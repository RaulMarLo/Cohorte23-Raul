package OOP.clases;

public class Fecha {

	private int dia;
	private int mes;
	private int año;
	private double hora;
	
	
	public String stringFecha(){
		
		return "La fecha es: " + this.dia + "/" + this.mes + "/" + this.año + ", " + this.hora + " P.M.";	
	}
	
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public double getHora() {
		return hora;
	}
	public void setHora(double hora) {
		this.hora = hora;
	}
	
}
