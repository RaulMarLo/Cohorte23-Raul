package com.generation.cohorte23.jpa.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.generation.cohorte23.jpa.model.UsuarioModel;

@Repository
public interface UsuarioRepositorio extends CrudRepository<UsuarioModel, Long> {

	public static ArrayList<UsuarioModel> busquedaPorPrioridad(Integer prioridad) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
