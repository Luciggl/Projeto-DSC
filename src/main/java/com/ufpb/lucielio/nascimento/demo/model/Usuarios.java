package com.ufpb.lucielio.nascimento.demo.model;

import com.ufpb.lucielio.nascimento.demo.enums.FunctionUser;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String username;
    private String email;
    private String password;
    private FunctionUser function;

    public Usuarios() {
    }

    public Usuarios(String nome, String login, String email, String password, FunctionUser function) {
        this.id = id;
        this.nome = nome;
        this.username = login;
        this.email = email;
        this.password = password;
        this.function = function;
    }

    public Long getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public FunctionUser getFunction() {
        return function;
    }

    public void setFunction(FunctionUser function) {
        this.function = function;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuarios user)) return false;
        return Objects.equals(getUsername(), user.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername());
    }
}
