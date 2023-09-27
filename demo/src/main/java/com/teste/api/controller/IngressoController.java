package com.teste.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.api.model.dto.IngressoDTO;
import com.teste.api.model.entidades.Ingresso;
import com.teste.api.service.IngressoService;

@RestController
@RequestMapping("/api/ingresso")
public class IngressoController {

	@Autowired
	private IngressoService ingressoService;

	@PostMapping
	public ResponseEntity<Ingresso> adicionarEvento(@RequestBody Ingresso novoEvento) {
		Ingresso eventoAdicionado = ingressoService.criarEvento(novoEvento);
		System.out.println(novoEvento.getEvento().getNome());
		return ResponseEntity.status(HttpStatus.CREATED).body(eventoAdicionado);

	}
	
	

	
//	@PostMapping
//	public ResponseEntity<Ingresso> adicionarIngresso(@RequestBody IngressoDTO ingressoDTO) {
//		Ingresso ingressoAdicionado = ingressoService.criarIngresso(ingressoDTO);
//		return ResponseEntity.status(HttpStatus.CREATED).body(ingressoAdicionado);
//	}

}
