package com.teste.api.model.repositorie;

import org.springframework.data.repository.CrudRepository;
import com.teste.api.model.entidades.UsuarioComum;


public interface UsuarioRepository extends CrudRepository<UsuarioComum, Integer> {

	

}
