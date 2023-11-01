package com.teste.api.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.api.model.dto.SetorDTO;
import com.teste.api.model.entidades.Setores;
import com.teste.api.model.repositorie.SetorRepository;

@Service
public class SetorService {

	@Autowired
	private SetorRepository setorRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	public Setores adicionaSetor(Setores setor) {
		setorRepository.save(setor);
		return setor;
	}

	public Setores obetemSetorPorId(int id) {
		return setorRepository.findById(id).orElse(null);
	}

	public SetorDTO obtemSetorPorIdDTO(int id) {
		Setores setor = setorRepository.findById(id).get();
		
		return modelMapper.map(setor, SetorDTO.class);
	}
	
	
}
