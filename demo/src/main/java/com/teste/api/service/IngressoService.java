package com.teste.api.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.api.model.dto.IngressoDTO;
import com.teste.api.model.entidades.Ingresso;
import com.teste.api.model.entidades.Setores;
import com.teste.api.model.repositorie.IngressoRepository;
import com.teste.api.model.repositorie.SetorRepository;

@Service
public class IngressoService {

	@Autowired
	private IngressoRepository ingressoRepository;
	
	@Autowired
	private SetorService setorService;

	@Autowired
	private ModelMapper modelMApper;

	public Ingresso criaIngresso(Ingresso ingresso) {
		
		Setores setor = setorService.obetemSetorPorId(ingresso.getSetor().getId());
		
		if(ingresso.getNome().equalsIgnoreCase(setor.getNome())) {
			return ingressoRepository.save(ingresso);
		}else {
			return null;
		}
		
		
		
	}

	public IngressoDTO obterIngressoPorIdDTO(int id) {

		Ingresso ingresso = ingressoRepository.findById(id).get();

		return modelMApper.map(ingresso, IngressoDTO.class);
	}

	public List<IngressoDTO> listarIngressos() {

		List<Ingresso> ingressos = this.ingressoRepository.findAll();

		return ingressos.stream().map(ingresso -> modelMApper.map(ingresso, IngressoDTO.class))
				.collect(Collectors.toList());

	}
	
	public Ingresso obterIngressoPorId(int id) {
		return ingressoRepository.findById(id).orElse(null);
	}

}
