package com.teste.api.service;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.teste.api.model.dto.ReservaDTO;
import com.teste.api.model.entidades.Carrinho;
import com.teste.api.model.entidades.Ingresso;
import com.teste.api.model.entidades.Reserva;
import com.teste.api.model.entidades.Setores;
import com.teste.api.model.entidades.UsuarioComum;
import com.teste.api.model.repositorie.ReservaRepository;

@Service
public class ReservaService {

	@Autowired
	private ReservaRepository reservaRepository;

//	@Autowired
//	private UsuarioService usuarioService;

	@Autowired
	private CarrinhoService carrinhoService;

	@Autowired
	private IngressoService ingressoService;

	@Autowired
	private SetorService setorService;

	@Autowired
	private ModelMapper modelMapper;

	public ReservaService(ReservaRepository reservaRepository) {
		super();
		this.reservaRepository = reservaRepository;
	}

	public Reserva criarReserva(Reserva reserva) {

	//	UsuarioComum usuario = usuarioService.obterUsuarioPorId(reserva.getUsuarioComum().getId());
		Carrinho carrinho = carrinhoService.obterCarrinhoPorId(reserva.getCarrinho().getId());
		Setores setor = null;
		int contador = 0;
		int total = 0;

		Set<Ingresso> ingressos = new HashSet<Ingresso>();

		for (Ingresso ingressoRequest : reserva.getIngresso()) {

			Ingresso ingresso = ingressoService.obterIngressoPorId(ingressoRequest.getId());
			ingressos.add(ingresso);
			setor = setorService.obetemSetorPorId(ingresso.getSetor().getId());

			total = totalIngressos(setor.getId());

			if (total + reserva.getIngressos().size() > setor.getQuantidadePessoas()) {

				ingresso.setStatus("Indisponivel");
				ingressoService.criaIngresso(ingresso);
				return null;
			}
			contador++;
		}

		Reserva novaReserva = new Reserva();

	//	novaReserva.setUsuarioComum(usuario);
		novaReserva.setCarrinho(carrinho);
		novaReserva.setIngresso(ingressos);
		novaReserva.setDataCriacao(LocalDateTime.now());
		novaReserva.setQuantidadeReserva(contador);
		novaReserva.setSetor(setor);

		return reservaRepository.save(novaReserva);
	}

	public List<ReservaDTO> listaReserva() {
		List<Reserva> reservas = reservaRepository.findAll();

		return reservas.stream().map(reserva -> modelMapper.map(reserva, ReservaDTO.class))
				.collect(Collectors.toList());
	}

	public ReservaDTO retornaReservaPorId(int id) {
		Reserva reserva = reservaRepository.findById(id).get();
		return modelMapper.map(reserva, ReservaDTO.class);
	}

	public int totalIngressos(int setorId) {
		return reservaRepository.contarReservasPorSetor3(setorId);

	}

}
