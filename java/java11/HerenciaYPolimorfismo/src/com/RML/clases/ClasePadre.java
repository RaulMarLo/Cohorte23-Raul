package com.RML.clases;

import java.util.Scanner;

public class ClasePadre {

	private boolean ActivaInactiva;
	private float Saldo;
	private int NumeroConsignaciones = 0;
	private int NumeroRetiros = 0;
	private float TasaAnual;
	private float ComisionMensualExtractos;
	
	
	

	
	public ClasePadre(boolean activaInactiva, float saldo, int numeroConsignaciones, int numeroRetiros, float tasaAnual,
			float comisionMensualExtractos) {
		super();
		
		ActivaInactiva = activaInactiva;
		Saldo = saldo;
		NumeroConsignaciones = numeroConsignaciones;
		NumeroRetiros = numeroRetiros;
		TasaAnual = tasaAnual;
		ComisionMensualExtractos = comisionMensualExtractos;
	}

		
		
		
		
	



	public void consignar() {
		
		if(Saldo>=10000) {
		Scanner datoScanner = new Scanner(System.in);
		
		System.out.println("El saldo es: ");
		Saldo += datoScanner.nextFloat();
		
		this.NumeroConsignaciones += 1;
		
		
		
		}
		
		else {
			
			System.out.println("Cuenta esta inactiva");
			
			}
		
	}
	
	public void retirar() {
		
		if (Saldo>=10000) {
			
			Scanner datoScanner = new Scanner(System.in);
			
			System.out.println("El saldo es: ");
			Saldo -= datoScanner.nextFloat();
			
		}
		
		else {
		
		System.out.println("Cuenta esta inactiva");
		
		}
	}
	
	public void extractoMensual() {
		
		
		
		if(NumeroRetiros>4) {
			
			ComisionMensualExtractos += ((NumeroRetiros-4)*1000);
		}
	}
		
		
	
	public float calcularTasaAnual() {
		
		Scanner scannerTasa = new Scanner(System.in);
		
		TasaAnual = scannerTasa.nextFloat();
		
		
		
		
		
		return TasaAnual*Saldo;
		
		
		
	}
	

	
	
	public boolean isActivaInactiva() {
		
		
		
		return (Saldo>=10000? true: false);
			
	}
	
	
	
	
	public void setActivaInactiva(boolean activaInactiva) {
		ActivaInactiva = activaInactiva;
	}


	public float getSaldo() {
		return Saldo;
	}



	public void setSaldo(float saldo) {
		Saldo = saldo;
	}



	public int getNumeroConsignaciones() {
		return NumeroConsignaciones;
	}



	public void setNumeroConsignaciones(int numeroConsignaciones) {
		NumeroConsignaciones = numeroConsignaciones;
	}



	public int getNumeroRetiros() {
		return NumeroRetiros;
	}



	public void setNumeroRetiros(int numeroRetiros) {
		NumeroRetiros = numeroRetiros;
	}



	public float getTasaAnual() {
		return TasaAnual;
	}



	public void setTasaAnual(float tasaAnual) {
		TasaAnual = tasaAnual;
	}



	public float getComisionMensualExtractos() {
		return ComisionMensualExtractos;
	}



	public void setComisionMensualExtractos(float comisionMensualExtractos) {
		ComisionMensualExtractos = comisionMensualExtractos;
	}


	@Override
	public String toString() {
		return "ClasePadre [ActivaInactiva=" + ActivaInactiva + ", Saldo=" + Saldo + ", NumeroConsignaciones="
				+ NumeroConsignaciones + ", NumeroRetiros=" + NumeroRetiros + ", TasaAnual=" + TasaAnual
				+ ", ComisionMensualExtractos=" + ComisionMensualExtractos + "]";
	}
	
	
	
	
}
