package com.teste.api.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.api.model.dto.LocalDTO;
import com.teste.api.model.entidades.Local;
import com.teste.api.model.repositorie.LocalRepository;

@Service
public class LocalService {

	@Autowired
	private LocalRepository localRepository;

	@Autowired
	private ModelMapper modelMapper;

	public Local adicionaLocal(Local local) {
		localRepository.save(local);
		return local;
	}
	
	
	public LocalDTO buscarLocalPorID(int id) {
		
		Local local = localRepository.findById(id).get();
		
		return modelMapper.map(local, LocalDTO.class);
		
	}
	
	public List<LocalDTO> bucarLocal() {
		
		List<Local> locais =  this.localRepository.findAll();
		
		return locais.stream()
				.map(local -> modelMapper.map(local, LocalDTO.class))
				.collect(Collectors.toList());
	}

}
