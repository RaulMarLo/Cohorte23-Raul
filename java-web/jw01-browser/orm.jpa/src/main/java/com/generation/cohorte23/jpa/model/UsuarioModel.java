package com.generation.cohorte23.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //1.Despues de crear el bean con sus constructores y gets-sets, lo convertimos a una entidad
@Table(name = "usuario")
public class UsuarioModel {
	
	@Id//3. Campo clave que define que atributos tiene, este debe ser NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)//4. If we want to automatically generate the primary key value, we can add the @GeneratedValue annotation. This can use four generation types: AUTO, IDENTITY, SEQUENCE and TABLE. If we don't explicitly specify a value, the generation type defaults to AUTO
	@Column(unique = true, nullable = false)//4.'Column' permite definir la estructura de las columnas, tal como el nombre y las ... Documentar un API REST con Swagger y Spring Boot

	private String nombre;
	private String email;
	private long id;
	private int prioridad;


	public UsuarioModel(String nombre, String email, long id, int prioridad) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.id = id;
		this.prioridad = prioridad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	
}