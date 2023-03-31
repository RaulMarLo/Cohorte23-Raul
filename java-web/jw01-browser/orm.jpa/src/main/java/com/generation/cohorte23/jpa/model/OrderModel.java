package com.generation.cohorte23.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "orden")
public class OrderModel {
	
	@Id//3. Campo clave que define que atributos tiene, este debe ser NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)//4. If we want to automatically generate the primary key value, we can add the @GeneratedValue annotation. This can use four generation types: AUTO, IDENTITY, SEQUENCE and TABLE. If we don't explicitly specify a value, the generation type defaults to AUTO
	@Column(unique = true, nullable = false)//4.'Column' permite definir la estructura de las columnas, tal como el nombre y las ... Documentar un API REST con Swagger y Spring Boot
	
	private Long id;
	private String nombreOrden;
	//private Long usuarioId;
	
	@ManyToOne
    private UsuarioModel usuario;
	
	public OrderModel() {
		// TODO Auto-generated constructor stub
	}
	
	public OrderModel(Long id, String nombreOrden, UsuarioModel usuario) {
		this.id = id;
		this.nombreOrden = nombreOrden;
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreOrden() {
		return nombreOrden;
	}
	public void setNombreOrden(String nombreOrden) {
		this.nombreOrden = nombreOrden;
	}
	/*public Long getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}*/

}
