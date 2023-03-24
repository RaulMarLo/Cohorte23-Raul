package com.generation.cohorte23.ioc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//'@RestController' define que es un controlador que inyecta las dependencias, se vuelve una clase controladora o clase cerebro
@RestController 
public class HolaMundo {
	
	//'@RequestMapping' mapea lo que ejecute el 	metodo al http, ("/") define que se usara el root 	del servidor, se le conoce como endpoint a ("/")
	@RequestMapping("/")
	public String hola() {
		
		return "Hola mundo, desde Spring Boot!";
	}
	
}
