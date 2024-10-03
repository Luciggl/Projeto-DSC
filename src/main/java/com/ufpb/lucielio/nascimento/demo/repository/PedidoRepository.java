package com.ufpb.lucielio.nascimento.demo.repository;

import com.ufpb.lucielio.nascimento.demo.model.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedidos, Long> {
}
