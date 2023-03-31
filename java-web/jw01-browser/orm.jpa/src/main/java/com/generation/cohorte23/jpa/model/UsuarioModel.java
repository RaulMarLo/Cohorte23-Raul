package com.generation.cohorte23.jpa.model;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity //1.Despues de crear el bean con sus constructores y gets-sets, lo convertimos a una entidad
@Table(name = "usuario")
public class UsuarioModel {
	
	@Id//3. Campo clave que define que atributos tiene, este debe ser NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)//4. If we want to automatically generate the primary key value, we can add the @GeneratedValue annotation. This can use four generation types: AUTO, IDENTITY, SEQUENCE and TABLE. If we don't explicitly specify a value, the generation type defaults to AUTO
	@Column(unique = true, nullable = false)//4.'Column' permite definir la estructura de las columnas, tal como el nombre y las ... Documentar un API REST con Swagger y Spring Boot

	//Se usan wrappers para hacer funciones de encapsulamiento
	private Long id;
	private String nombre;
	private String email;
	private Integer prioridad;
	
	@OneToMany(mappedBy = "usuario")
	private ArrayList<ProductoModel> productos;
	
	@OneToMany(mappedBy = "usuario")
	private ArrayList<OrderModel> ordenes;
	
	public UsuarioModel() {
		// TODO Auto-generated constructor stub
	}
	
	public UsuarioModel(Long id, String nombre, String email, Integer prioridad, ArrayList<ProductoModel> productos,
			ArrayList<OrderModel> ordenes) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.prioridad = prioridad;
		this.productos = productos;
		this.ordenes = ordenes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Integer getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Integer prioridad) {
		this.prioridad = prioridad;
	}

	public ArrayList<ProductoModel> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<ProductoModel> productos) {
		this.productos = productos;
	}

	public ArrayList<OrderModel> getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(ArrayList<OrderModel> ordenes) {
		this.ordenes = ordenes;
	}

	
	
	
}