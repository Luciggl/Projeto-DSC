package com.ufpb.lucielio.nascimento.demo.service;

import com.ufpb.lucielio.nascimento.demo.model.Usuarios;
import com.ufpb.lucielio.nascimento.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }


    public Usuarios buscarUserPorId(Long id){
        return repository.getById(id);
    }

    public List<Usuarios> buscarTodos() {
        return repository.findAll();
    }
}
