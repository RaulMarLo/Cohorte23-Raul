package com.generation.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.repositories.ProductoRepository;

@Service

public class ProductoService {

	//Creo el objeto de la interfaz ProductoRepository
	private final ProductoRepository productoRepository;
	
	//Cablear con autowired
	@Autowired
	
	//Uso ese objeto como parametro de mi constructor
	public ProductoService(ProductoRepository productoRepository){
		this.productoRepository = productoRepository;
	}
	
	
//	CREATE (Método para agregar un objeto de tipo Producto y guardarlo en la base de datos. Si el producto existe la base de datos permanece en el mismo estado, ya que de actualizar mostraria un producto duplicado
	public void crearProducto(Producto prod) {
		
		Optional<Producto> productoBuscado = 
                productoRepository.findByNombre(prod.getNombre());
        if (productoBuscado.isPresent()) {
            throw new IllegalStateException("El producto con el nombre " + "[" + prod.getNombre() + "] ya existe.");
        } else {
            productoRepository.save(prod);
        }//else //if 
    }//addProducto
		
	
//	READ//Leer por findAll
	
	public List<Producto> leerProductos() {
		
		return productoRepository.findAll();
		
	}
	
	//Read (leer un producto con un id especifico)
    public Producto leerProducto(Long prodId) {
        return productoRepository.findById(prodId).
                orElseThrow(()-> new IllegalStateException("El Producto con el id " + prodId + " no existe.") );
        
        
    }//getProducto
    
    
//	UPDATE (Solo actualizara sin retornar el producto)
	public void actualizarProducto(Long prodId, String nombre, String descripcion, String URL_Imagen, double precio) {
		
		if(productoRepository.existsById(prodId)) {
			
			//Si el producto existe entonces lo modifico
			Producto productoABuscar = productoRepository.getById(prodId); //Ya que verifico que mi producto existe, lo traigo y lo asigno a una variable llamada productoABuscar
			
			if (nombre!=null) productoABuscar.setNombre(nombre);
			if (descripcion!=null) productoABuscar.setDescripcion(descripcion);
			if (precio!=0) productoABuscar.setPrecio(precio);
			if (URL_Imagen!=null) productoABuscar.setURL_Imagen(URL_Imagen);

			//cuando termino de editar el objeto...
			productoRepository.save(productoABuscar);
			
		}else {
			
			System.out.println("El producto con el id " + prodId + " no existe");
		}
		
		
	}
	
//	DELETE
	public void borrarProducto(Long prodId) {

		if (productoRepository.existsById(prodId)) {
			productoRepository.deleteById(prodId);
		}
	}
}