package com.teste.api.service;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teste.api.model.dto.EventoFinalDTO;
import com.teste.api.model.entidades.Evento;
import com.teste.api.model.repositorie.EventoRepository;

@Service
public class EventoService {

	@Autowired
	private EventoRepository eventoRepository; // injeção de dependencia

	@Autowired
	private ModelMapper modelMapper;

	public Evento criarEvento(Evento evento) {

		return eventoRepository.save(evento);
	}

	public List<EventoFinalDTO> dadosEvento() {

		List<Evento> eventos = this.eventoRepository.findAll();

		return eventos.stream() // cria um fluxo de evento
				.map(evento -> modelMapper.map(evento, EventoFinalDTO.class)) // converte cada evento para um eventoDTO
				.collect(Collectors.toList()); // coleta tds os eventos em uma lista

	}

	public EventoFinalDTO buscaPorId(int id) {

		Evento eventos = this.eventoRepository.findById(id).get();
		return modelMapper.map(eventos, EventoFinalDTO.class);

	}

	public Evento buscaEventoPorId(int id) {

		 return eventoRepository.findById(id).get();
		
	}

	// Evento evento = this.eventoRepository.findById(6).get();
//	
//	return modelMapper.map(evento, EventoDTO.class);
}
