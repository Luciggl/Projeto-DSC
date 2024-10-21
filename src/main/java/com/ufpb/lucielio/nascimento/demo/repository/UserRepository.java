package com.ufpb.lucielio.nascimento.demo.repository;

import com.ufpb.lucielio.nascimento.demo.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<Usuarios, Long> {
    UserDetails findByUsername(String username);
}
