package com.teste.api.model.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.teste.api.model.dto.EventoInicialDTO;
import com.teste.api.model.entidades.Evento;
import com.teste.api.model.entidades.Local;

@Configuration
public class ModelConfiguration {

	@Bean
	public ModelMapper getModel() {
		var modelMapper = new ModelMapper();
		
		return new ModelMapper();
		
	}
	
	
}
