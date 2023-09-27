package com.teste.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.teste.api.model.entidades.Evento;
import com.teste.api.service.EventoService;
@RestController
@RequestMapping("/api/evento")
public class EventoController {

	@Autowired
	private EventoService eventoService;

	@PostMapping
	public ResponseEntity<Evento> adicionarEvento(@RequestBody Evento novoEvento) {
	    Evento eventoAdicionado = eventoService.criarEvento(novoEvento);
	    
	    return ResponseEntity.status(HttpStatus.CREATED).body(eventoAdicionado);
	}

}
