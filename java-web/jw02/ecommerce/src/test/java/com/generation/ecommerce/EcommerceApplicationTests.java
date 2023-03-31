package com.generation.ecommerce;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.services.ProductoService;

@SpringBootTest
@AutoConfigureMockMvc //Anotacion de dependencia de Mockito que permite hacer pruebas con jUnit

class EcommerceApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;//Declaramos una instancia del MockMvc
	
	@Test //PRUEBA GET
	public void pruebaGet() throws Exception {
		this.mockMvc.perform(get("/miOtzo/productos/1"))//Checa que el resultado este en path
					.andDo(print())//hace una impresion y
					.andExpect(status().isOk())//espera que el status sea OK
					.andExpect(content().string(containsString("papasSabritas.jpg")));//y que contenga el string definido ("StringAProbar")
						}
		
		
		
	@Test//PRUEBA DELETE
	@Disabled ("Deshabilitado porque ya fue probado")
	public void pruebaDelete() throws Exception {
	this.mockMvc.perform(delete("/miOtzo/productos/8"))//Checa que el path tenga el string eliminado
					.andDo(print())//hace una impresion y
					.andExpect(status().isOk());//espera que el status sea OK
		
	}
	
	
	@Test
	@Disabled
	public void pruebaPost() throws Exception {
		Producto p = new Producto();
		p.setNombre("Chocorrol");
		p.setDescripcion("Chocorrol Sabroso");
		p.setURL_Imagen("producto4.jpg");
		p.setPrecio(10.00);

	
	
	this.mockMvc.perform(post("/miOtzo/productos/")
			
			.contentType(MediaType.APPLICATION_JSON)//Hace el post en contentType tipo JSON
			.content(asJsonString(p)))
			
			
			
					.andDo(print())//hace una impresion y
					.andExpect(status().isOk());
						
		
	}
	
	private static String asJsonString(final Object obj) {
        try {
          return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
          throw new RuntimeException(e);
        }//catch
     } // asJsonString

	
	@Test
    public void pruebaPUT() throws Exception {
        this.mockMvc.perform(put("/api/productos/10")
                .queryParam("imagen", "producto_x.jpg")//Le damos los parametros que va a consultar
                )
        .andDo( print() )
        .andExpect( status().isOk() )
        
        .andExpect( content().string( 
                containsString("producto_x.jpg")
                ) );
    }//pruebaPUT
}
