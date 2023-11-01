package com.teste.api.service;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teste.api.model.dto.CarrinhoDTO;
import com.teste.api.model.entidades.Carrinho;
import com.teste.api.model.repositorie.CarrinhoRepository;

@Service
public class CarrinhoService {

	@Autowired
	private CarrinhoRepository carrinhoRepository;

	@Autowired
	private ModelMapper modelMapper;

	public Carrinho adicionaCarrinhho(Carrinho carrinho) {
		carrinhoRepository.save(carrinho);

		return carrinho;
	}

	public Carrinho obterCarrinhoPorId(int long1) {
		return carrinhoRepository.findById(long1).orElse(null);

	}

	public List<CarrinhoDTO> obterCarrinho() {

		List<Carrinho> eventos = this.carrinhoRepository.findAll();

		return eventos.stream() // cria um fluxo de carrinho
				.map(carrinho -> modelMapper.map(carrinho, CarrinhoDTO.class)) // converte cada carrinho para um carrinhoDTO
				.collect(Collectors.toList()); // coleta tds os carrinho em uma lista

	}

}
