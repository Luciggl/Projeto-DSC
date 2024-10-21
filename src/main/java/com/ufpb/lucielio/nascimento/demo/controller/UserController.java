package com.ufpb.lucielio.nascimento.demo.controller;

import com.ufpb.lucielio.nascimento.demo.dto.UserDTO;
import com.ufpb.lucielio.nascimento.demo.dto.UserDTOResponse;
import com.ufpb.lucielio.nascimento.demo.model.Usuarios;
import com.ufpb.lucielio.nascimento.demo.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class UserController {
    private UserService service;
    private ModelMapper mapper;

    public UserController(UserService service, ModelMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }


    @GetMapping("/users")
    public List<UserDTOResponse> getUsers(){
        List<Usuarios> users = service.buscarTodos();
        return users.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTOResponse createUser(@RequestBody UserDTO userDTO){
        Usuarios u = convertToEntity(userDTO);
        Usuarios salvo = service.criarNovoUsuario(u);
        return convertToDTO(salvo);
    }

    public UserDTOResponse convertToDTO(Usuarios user){
        return mapper.map(user, UserDTOResponse.class);
    }

    public Usuarios convertToEntity(UserDTO userDTO){
        return mapper.map(userDTO, Usuarios.class);
    }
}
