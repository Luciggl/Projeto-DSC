package com.ufpb.lucielio.nascimento.demo.model;

import com.ufpb.lucielio.nascimento.demo.enums.FunctionUser;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String login;
    private String senha;
    private FunctionUser function;

    public Usuarios(String nome, String login, String senha, FunctionUser function) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.function = function;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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
        return Objects.equals(getLogin(), user.getLogin());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogin());
    }
}
