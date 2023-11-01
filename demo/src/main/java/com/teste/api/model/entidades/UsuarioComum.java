package com.teste.api.model.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;


@Entity
public class UsuarioComum extends Usuario {

	@OneToOne(mappedBy = "usuarioComum")
    private Carrinho carrinho;

	public UsuarioComum(Carrinho carrinho) {
		super();
		this.carrinho = carrinho;
	}

	public UsuarioComum() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsuarioComum(int id, String nome, String email, String senha) {
		super(id, nome, email, senha);
		// TODO Auto-generated constructor stub
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
	
	
	
}
