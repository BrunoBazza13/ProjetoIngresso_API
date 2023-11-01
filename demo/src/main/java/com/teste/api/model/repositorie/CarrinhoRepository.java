package com.teste.api.model.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import com.teste.api.model.entidades.Carrinho;

public interface CarrinhoRepository extends JpaRepository<Carrinho, Integer> {

}
