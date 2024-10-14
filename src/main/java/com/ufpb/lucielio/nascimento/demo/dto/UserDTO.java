package com.ufpb.lucielio.nascimento.demo.dto;

import com.ufpb.lucielio.nascimento.demo.enums.FunctionUser;
import com.ufpb.lucielio.nascimento.demo.model.Usuarios;

import java.util.Objects;

public class UserDTO {
    private String nome;
    private String login;
    private String senha;
    private FunctionUser function;

    public UserDTO(String nome, String login, String senha, FunctionUser function) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.function = function;
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
