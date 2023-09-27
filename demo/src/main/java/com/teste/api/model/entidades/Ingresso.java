package com.teste.api.model.entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ingresso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "evento_id")
	private Evento evento;

	private String disponivel;

	// private String tipoIngresso;
	private String status;

	public Ingresso() {

	}

	public Ingresso(Evento evento, String disponivel, String status) {
		super();
		this.evento = evento;
//		this.reserva = reserva;
		this.disponivel = disponivel;
		this.status = status;
	}





//	public Reserva getReserva() {
//		return reserva;
//	}
//
//	public void setReserva(Reserva reserva) {
//		this.reserva = reserva;
//	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public String isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(String disponivel) {
		this.disponivel = disponivel;
	}

}
