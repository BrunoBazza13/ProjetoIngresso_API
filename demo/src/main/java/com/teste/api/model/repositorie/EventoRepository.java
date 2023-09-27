package com.teste.api.model.repositorie;

import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.teste.api.model.entidades.Evento;

public interface EventoRepository extends CrudRepository<Evento, Integer>{

}
