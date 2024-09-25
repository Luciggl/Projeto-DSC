package com.ufpb.lucielio.nascimento.demo.repository;

import com.ufpb.lucielio.nascimento.demo.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findAllById(Long idProduto);
}
