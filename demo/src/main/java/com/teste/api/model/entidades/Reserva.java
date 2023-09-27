package com.teste.api.model.entidades;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToMany
	@JoinTable(name = "reserva_ingresso", joinColumns = @JoinColumn(name = "reserva_id"), inverseJoinColumns = @JoinColumn(name = "ingresso_id"))
	private List<Ingresso> ingressos = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "usuariocomum_id")
	private UsuarioComum usuarioComum;

	private String status;

	public Reserva() {

	}

	public Reserva(List<Ingresso> ingressos, UsuarioComum usuarioComum, String status) {
		super();
		this.ingressos = ingressos;
		this.usuarioComum = usuarioComum;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UsuarioComum getUsuario() {
		return usuarioComum;
	}

	public void setUsuario(UsuarioComum usuario) {
		this.usuarioComum = usuario;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Ingresso> getIngressos() {
		return ingressos;
	}

	public void setIngressos(List<Ingresso> ingressos) {
		this.ingressos = ingressos;
	}

}
