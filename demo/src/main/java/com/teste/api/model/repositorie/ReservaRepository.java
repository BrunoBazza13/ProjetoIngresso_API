package com.teste.api.model.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.teste.api.model.entidades.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {


	@Query("SELECT COALESCE(SUM(r.quantidadeReserva), 0) FROM Reserva r WHERE r.setor.id = :setorId") // soma quantidade de ingresso por setor e retorna um valor int
	int contarReservasPorSetor3(@Param("setorId") int setorId);

}
