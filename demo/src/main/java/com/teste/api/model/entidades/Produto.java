package com.teste.api.model.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {

	@Id // toda entidade precisa de um id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // isso signfica que o produto vai ter sua propria sequencia de
	// id unica
	// obs: essas anotações possuem estrategias diferentes...
	private int id;
	
	
	private String nome;
	
	private double preco;
	
	private double desconto;

	public Produto() {
		
	}
	
	public Produto(int id, String nome, double preco, double desconto) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	
	
	
	
	
	
}
