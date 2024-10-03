package com.ufpb.lucielio.nascimento.demo.dto;

import com.ufpb.lucielio.nascimento.demo.model.Endereco;
import com.ufpb.lucielio.nascimento.demo.model.Pedidos;
import com.ufpb.lucielio.nascimento.demo.model.Produto;

import java.util.List;

public class UserDTO {
    private String nome;
    private String email;
    private String senha;
    private Endereco endereco;
    private List<Produto> carrinhoDeCompras;
    private List<Pedidos> pedidosList;

    public UserDTO(String nome, String email, String senha, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
    }

    public UserDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Produto> getCarrinhoDeCompras() {
        return carrinhoDeCompras;
    }

    public void setCarrinhoDeCompras(List<Produto> carrinhoDeCompras) {
        this.carrinhoDeCompras = carrinhoDeCompras;
    }

    public List<Pedidos> getPedidosList() {
        return pedidosList;
    }

    public void setPedidosList(List<Pedidos> pedidosList) {
        this.pedidosList = pedidosList;
    }
}
