package com.ufpb.lucielio.nascimento.demo.repository;

import com.ufpb.lucielio.nascimento.demo.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
