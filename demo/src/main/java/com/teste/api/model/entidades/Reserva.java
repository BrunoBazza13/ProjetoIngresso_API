package com.teste.api.model.entidades;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
@Entity
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@ManyToMany
	@JoinTable(name = "reserva_ingresso", joinColumns = @JoinColumn(name = "reserva_id"), inverseJoinColumns = @JoinColumn(name = "ingresso_id"))
	private Set<Ingresso> ingressos = new HashSet<>();

	@OneToOne(mappedBy = "reserva")
	private Pedido pedido;

	
//	@ManyToOne
//	@JoinColumn(name = "usuariocomum_id")
//	private UsuarioComum usuarioComum;

	//@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "carrinho_id")
	private Carrinho carrinho;

	
	@ManyToOne
	@JoinColumn(name = "setor_id")
	private Setores setor;

	private int quantidadeReserva;

	private LocalDateTime dataCriacao;

	public Reserva() {

	}

	public Reserva(Set<Ingresso> ingressos, Pedido pedido, UsuarioComum usuarioComum, Carrinho carrinho, Setores setor,
			int quantidadeReserva, LocalDateTime dataCriacao) {
		super();
		this.ingressos = ingressos;
		this.pedido = pedido;
//		this.usuarioComum = usuarioComum;
		this.carrinho = carrinho;
		this.setor = setor;
		this.quantidadeReserva = quantidadeReserva;
		this.dataCriacao = dataCriacao;
	}

	
	public Setores getSetor() {
		return setor;
	}

	public void setSetor(Setores setor) {
		this.setor = setor;
	}

	public int getQuantidadeReserva() {
		return quantidadeReserva;
	}

	public void setQuantidadeReserva(int quantidadeReserva) {
		this.quantidadeReserva = quantidadeReserva;
	}

	public Set<Ingresso> getIngressos() {
		return ingressos;
	}

	public void setIngressos(Set<Ingresso> ingressos) {
		this.ingressos = ingressos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Ingresso> getIngresso() {
		return ingressos;
	}

	public void setIngresso(Set<Ingresso> ingresso) {
		this.ingressos = ingresso;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

//	public UsuarioComum getUsuarioComum() {
//		return usuarioComum;
//	}
//
//	public void setUsuarioComum(UsuarioComum usuarioComum) {
//		this.usuarioComum = usuarioComum;
//	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

}
