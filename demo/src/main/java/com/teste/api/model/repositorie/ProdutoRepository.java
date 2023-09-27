package com.teste.api.model.repositorie;

import org.springframework.data.repository.CrudRepository;


import com.teste.api.model.entidades.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
