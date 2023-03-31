package com.generation.cohorte23.jpa.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.cohorte23.jpa.model.UsuarioModel;
import com.generation.cohorte23.jpa.repositories.UsuarioRepositorio;

@Service
public class UsuarioServices {
	
	@Autowired
	UsuarioRepositorio ObjetoUR;
	
	
	public boolean eliminarUsuario(Long id) {
		
		try {
			
			ObjetoUR.deleteById(id);
			return true;
		}
		catch (Exception e) {
			// TODO: handle exception
			
			return false;
		}
		
	}
	
	//6. Se implementa un metodo, aunque no esta declarado en la interface, esta siendo heredado en el Repositories
	public ArrayList<UsuarioModel> obtenerPorPrioridad(Integer prioridad){
		
		return ObjetoUR.findByPrioridad(prioridad);
	}
	
	//7.
	public ArrayList<UsuarioModel>listarUsuarios() {
		
		return (ArrayList<UsuarioModel>) ObjetoUR.findAll();
	}

	public UsuarioModel guardarUsuario(UsuarioModel usuario) {
		
		//8. Retorna el objeto UR que viene heredado de UsuarioRepositorio y guarda el (usuario) con el metodo save que viene del CrudRepository
		return ObjetoUR.save(usuario);
	}
	
	public Optional<UsuarioModel> obtenerPorId(Long id) {
		
		return ObjetoUR.findById(id);
	}
	
}
