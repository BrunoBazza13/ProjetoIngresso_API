package com.teste.api.model.dto;

import java.util.List;

import com.teste.api.model.entidades.Reserva;

public class CarrinhoDTO {

	
	 private List<ReservaDTO> reservas;

	public List<ReservaDTO> getReservas() {
		return reservas;
	}

	public void setReservas(List<ReservaDTO> reservas) {
		this.reservas = reservas;
	}
	
	
}
