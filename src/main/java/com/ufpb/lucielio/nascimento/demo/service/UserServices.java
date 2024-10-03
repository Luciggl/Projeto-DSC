package com.ufpb.lucielio.nascimento.demo.service;

import com.ufpb.lucielio.nascimento.demo.model.User;
import com.ufpb.lucielio.nascimento.demo.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServices {
    private ModelMapper modelMapper;
    private UserRepository userRepository;

    public UserServices(ModelMapper modelMapper, UserRepository userRepository) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }

    public Optional<User> buscarUsuarioPeloId(Long id){
         return userRepository.findById(id);
    }
}
