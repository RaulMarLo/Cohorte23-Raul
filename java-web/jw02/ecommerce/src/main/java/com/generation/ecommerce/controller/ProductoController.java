package com.generation.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.services.ProductoService;

//Aqui permitimos que la base de datos puede recivir los datos de un navegador, donde recibe datos con los puertos especificados, en este caso * (todos).
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,
        RequestMethod.PUT })

//Le decimos que es un controller para soportar metodos HTTP
@RestController

@RequestMapping(path ="/miOtzo/productos/")

public class ProductoController {
	
//	Declara la instancia de la Clase ProductoRepository que se utiliza para acceder a los metodos definidos ahi. Se declara como final porque su valor no sera cambiado despues de inicializar, para que esta instancia no cambie del programa
	
	
	//Instancia de la clase "ProductoService"
	
	private final ProductoService instanciaProductoService;
	//"no nos llames, nosotros te llamamos"
	
    @Autowired //Se usa para indicar a Spring que inyecte automaticamente una instancia del ProductoService en la clase ProductoController. Asi nos aseguramos que la instancia esta disponible y lista para usarse cuando se necesite en la clase.
    
    public ProductoController(ProductoService productoServicio) {
    	
    	this.instanciaProductoService = productoServicio;
    	
    }
	
    
	
	//HTTP GET
    @GetMapping(path = "{prodId}")
	public List<Producto> getProductos(){
		
    	return instanciaProductoService.leerProductos();
	}
	
	//HTTP POST
    @PostMapping
	public void postProducto(@RequestBody Producto prod) {//No agrego un producto, agrego un CUERPO a ese producto para que pueda convertirse en un JSON
		
    	instanciaProductoService.crearProducto(prod);//Disparo la operacion CRUD para modificar mi BD
	}
	
    
	//HTTP PUT
    @PutMapping(path = "{prodId}")
	public void updateProducto(Long prodId,
	
    	@RequestParam(required = false) String nombre,
    	@RequestParam(required = false) String descripcion,
    	@RequestParam(required = false) double precio,
    	@RequestParam(required = false) String url_Imagen) {
    	
    	instanciaProductoService.actualizarProducto(prodId, nombre, descripcion, url_Imagen, precio);

	}

	//HTTP DELETE
    @DeleteMapping(path = "{prodId}")
	public void deleteProducto(Long prodId) {
	
    	instanciaProductoService.borrarProducto(prodId);
    }
	}

