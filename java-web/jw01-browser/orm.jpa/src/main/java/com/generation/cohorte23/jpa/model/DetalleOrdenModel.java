package com.generation.cohorte23.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "detalle_orden")
public class DetalleOrdenModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombreDetalleOrden;
    
    @ManyToOne
    private OrderModel orden;
    
    @ManyToOne
    private ProductoModel producto;

	public DetalleOrdenModel() {
		// TODO Auto-generated constructor stub
	}

	public DetalleOrdenModel(Long id, String nombreDetalleOrden, OrderModel orden, ProductoModel producto) {
		this.id = id;
		this.nombreDetalleOrden = nombreDetalleOrden;
		this.orden = orden;
		this.producto = producto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreDetalleOrden() {
		return nombreDetalleOrden;
	}

	public void setNombreDetalleOrden(String nombreDetalleOrden) {
		this.nombreDetalleOrden = nombreDetalleOrden;
	}

	public OrderModel getOrden() {
		return orden;
	}

	public void setOrden(OrderModel orden) {
		this.orden = orden;
	}

	public ProductoModel getProducto() {
		return producto;
	}

	public void setProducto(ProductoModel producto) {
		this.producto = producto;
	}
    
}