package com.teste.api.model.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.teste.api.model.entidades.Ingresso;
import com.teste.api.model.entidades.Usuario;

public interface IngressoRepository extends JpaRepository<Ingresso,  Integer>{

}
