package com.ufpb.lucielio.nascimento.demo.dto;

import com.ufpb.lucielio.nascimento.demo.enums.FunctionUser;

import java.util.Objects;

public class UserDTOResponse {
    private Long id;
    private String nome;
    private String login;
    private FunctionUser functionUser;

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

    public FunctionUser getFunctionUser() {
        return functionUser;
    }

    public void setFunctionUser(FunctionUser functionUser) {
        this.functionUser = functionUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTOResponse that = (UserDTOResponse) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(login, that.login) && functionUser == that.functionUser;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, login, functionUser);
    }
}
