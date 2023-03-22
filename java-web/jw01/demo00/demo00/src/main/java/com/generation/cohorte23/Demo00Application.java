package com.generation.cohorte23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Anotacion, concepto de inyeccion de dependecias. Clase que ejecuta SpringApplication
public class Demo00Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo00Application.class, args);
	}//Aqui ejecuta SpringApplication con run

}
