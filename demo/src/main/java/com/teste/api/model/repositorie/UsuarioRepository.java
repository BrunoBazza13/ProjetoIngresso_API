package com.teste.api.model.repositorie;

import org.springframework.data.repository.CrudRepository;

import com.teste.api.model.entidades.Usuario;
import com.teste.api.model.entidades.UsuarioComum;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

	

}
