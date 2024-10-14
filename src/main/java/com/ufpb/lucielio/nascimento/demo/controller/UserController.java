package com.ufpb.lucielio.nascimento.demo.controller;

import com.ufpb.lucielio.nascimento.demo.dto.UserDTO;
import com.ufpb.lucielio.nascimento.demo.model.Usuarios;
import com.ufpb.lucielio.nascimento.demo.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class UserController {
    private UserService service;
    private ModelMapper mapper;

    public UserController(UserService service) {
        this.service = service;
    }


    @GetMapping("/users")
    public List<UserDTO> getUsers(){
        List<Usuarios> users = service.buscarTodos();
        return users.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public UserDTO convertToDTO(Usuarios user){
        return mapper.map(user, UserDTO.class);
    }
}
