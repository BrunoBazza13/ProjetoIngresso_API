package com.teste.api.model.dto;

import java.io.Serializable;
import java.util.List;

public class ReservaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private int quantidadeReserva;
	private List<IngressoCarrinhoDTO> ingresso;

	public int getQuantidadeReserva() {
		return quantidadeReserva;
	}

	public void setQuantidadeReserva(int quantidadeReserva) {
		this.quantidadeReserva = quantidadeReserva;
	}



	public List<IngressoCarrinhoDTO> getIngresso() {
		return ingresso;
	}

	public void setIngresso(List<IngressoCarrinhoDTO> ingresso) {
		this.ingresso = ingresso;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
