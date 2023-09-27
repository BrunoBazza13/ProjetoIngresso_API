package com.teste.api.model.entidades;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
//	 @OneToMany(mappedBy = "evento")
//	 private List<Ingresso> ingressos;
	
	private String local;
	private String nome;
	private String descricao;
	private Date data;
	private String atracao;
	
	
	public Evento() {
		
	}
	
	
	public Evento( String local, String nome, String descricao, Date data, String atracao) {
		super();
		
		this.local = local;
		this.nome = nome;
		this.descricao = descricao;
		this.data = data;
		this.atracao = atracao;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getAtracao() {
		return atracao;
	}
	public void setAtracao(String atracao) {
		this.atracao = atracao;
	}
	
	
	
}
