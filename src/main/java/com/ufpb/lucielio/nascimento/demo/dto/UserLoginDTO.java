package com.ufpb.lucielio.nascimento.demo.dto;

public class UserLoginDTO {
    private String username;
    private String password;

    public UserLoginDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserLoginDTO(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return password;
    }

    public void setSenha(String password) {
        this.password = password;
    }
}
