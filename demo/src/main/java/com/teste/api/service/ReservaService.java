package com.teste.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.api.model.entidades.Reserva;
import com.teste.api.model.repositorie.ReservaRepository;

@Service
public class ReservaService {

	private ReservaRepository reservaRepository;
	
	@Autowired
	public ReservaService(ReservaRepository reservaRepository) {
		super();
		this.reservaRepository = reservaRepository;
	}
	
	 public Reserva criarEvento(Reserva reserva) {
	        // Adicione lógica de validação, se necessário
	        return reservaRepository.save(reserva);
	    }
	 
	 public Iterable<Reserva> listarReservas() {
	        // Use o método findAll do repository para buscar todas as reservas no banco de dados.
	        return reservaRepository.findAll();
	    }
	
}
