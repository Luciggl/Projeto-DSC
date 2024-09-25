package com.ufpb.lucielio.nascimento.demo.repository;

import com.ufpb.lucielio.nascimento.demo.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
