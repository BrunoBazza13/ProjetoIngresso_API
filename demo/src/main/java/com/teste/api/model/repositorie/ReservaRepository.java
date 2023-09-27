package com.teste.api.model.repositorie;

import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.teste.api.model.entidades.Reserva;

public interface ReservaRepository extends  CrudRepository<Reserva, Integer> {

}
