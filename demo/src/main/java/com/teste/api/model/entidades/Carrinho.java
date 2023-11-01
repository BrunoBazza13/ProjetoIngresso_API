package com.teste.api.model.entidades;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Carrinho {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	@JoinColumn(name = "usuario_id")
	private UsuarioComum usuarioComum;

	@OneToMany(mappedBy = "carrinho")
	private List<Reserva> reservas = new ArrayList<>();
	
	private double total;
	
	private int quantidade;

	public Carrinho() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carrinho(UsuarioComum usuarioComum, List<Reserva> reservas) {
		super();
		this.usuarioComum = usuarioComum;
		this.reservas = reservas;
	}

	public Carrinho(UsuarioComum usuarioComum) {
		this.usuarioComum = usuarioComum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UsuarioComum getUsuarioComum() {
		return usuarioComum;
	}

	public void setUsuarioComum(UsuarioComum usuarioComum) {
		this.usuarioComum = usuarioComum;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

}
