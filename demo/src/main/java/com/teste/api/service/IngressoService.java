package com.teste.api.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.api.model.entidades.Evento;
import com.teste.api.model.entidades.Ingresso;
import com.teste.api.model.repositorie.IngressoRepository;

@Service
public class IngressoService {

	private  IngressoRepository ingressoRepository;

	@Autowired
	public IngressoService(IngressoRepository ingressoRepository) {
		super();
		this.ingressoRepository = ingressoRepository;
	}
	
	 public Ingresso criarEvento(Ingresso ingresso) {
	        // Adicione lógica de validação, se necessário
	        return ingressoRepository.save(ingresso);
	    }
	
	
	
}
