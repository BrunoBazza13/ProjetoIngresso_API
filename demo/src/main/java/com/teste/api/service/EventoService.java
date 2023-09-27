package com.teste.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.api.model.entidades.Evento;
import com.teste.api.model.repositorie.EventoRepository;

@Service
public class EventoService {

	
	private EventoRepository eventoRepository; //injeção de dependencia 

	@Autowired
	public EventoService(EventoRepository eventoRepository) {
		super();
		this.eventoRepository = eventoRepository;
	}
	
	 public Evento criarEvento(Evento evento) {
	        // Adicione lógica de validação, se necessário
	        return eventoRepository.save(evento);
	    }
	
	
	
	
	
	
}
