package com.teste.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teste.api.model.entidades.Produto;
import com.teste.api.model.repositorie.ProdutoRepository;


@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	ProdutoRepository produtoRepository;
	
	 @RequestMapping(method = {RequestMethod.PUT, RequestMethod.POST})
	public Produto insereProduto(Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}
	 
	 @GetMapping(path = "/{id}")
	 public Optional<Produto> getProdutoPorID(@PathVariable int id) {
		 return produtoRepository.findById(id);
	 }
	 
	 @GetMapping
	 public Iterable<Produto> getProduto() {
		 return produtoRepository.findAll();
	 }
	 
	 
}
