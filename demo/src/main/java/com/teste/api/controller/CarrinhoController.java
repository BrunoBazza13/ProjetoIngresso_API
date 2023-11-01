package com.teste.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.api.model.dto.CarrinhoDTO;
import com.teste.api.service.CarrinhoService;

@RestController
@RequestMapping("/api/carrinho")
public class CarrinhoController {

	@Autowired
	private CarrinhoService carrinhoService;

	@GetMapping
	public ResponseEntity<List<CarrinhoDTO>> getCarrinho() {

		List<CarrinhoDTO> carrinhoDTO = carrinhoService.obterCarrinho();

		return new ResponseEntity<List<CarrinhoDTO>>(carrinhoDTO, HttpStatus.OK);

	}

}

//public ResponseEntity<Carrinho> adicionarCarrinho(Carrinho carrinho) {
//
//	Carrinho carrinhoAdicionado = carrinhoService.adicionaCarrinhho(carrinho);
//
//	return ResponseEntity.status(HttpStatus.CREATED).body(carrinhoAdicionado);
//}