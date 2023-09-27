package com.teste.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.api.model.entidades.Reserva;
import com.teste.api.service.ReservaService;

@RestController
@RequestMapping("/api/teste")
public class ReservaController {

	@Autowired
	private ReservaService reservaService;

	@PostMapping
	public ResponseEntity<Reserva> adicionarEvento(@RequestBody Reserva novaReserva) {
//		System.out.println(novaReserva.getUsuario().getNome());
		Reserva reservaAdicionado = reservaService.criarEvento(novaReserva);
		return ResponseEntity.status(HttpStatus.CREATED).body(reservaAdicionado);
	}

	@GetMapping
	public ResponseEntity<Iterable<Reserva>> listarReservas() {
		Iterable<Reserva> reservas = reservaService.listarReservas();
		
		return new ResponseEntity<>(reservas, HttpStatus.OK);
		
	}

}
