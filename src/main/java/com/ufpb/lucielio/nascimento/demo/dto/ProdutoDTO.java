package com.ufpb.lucielio.nascimento.demo.dto;

import com.ufpb.lucielio.nascimento.demo.enums.CategoriaProduto;

import java.math.BigDecimal;

public class ProdutoDTO {
    private String nome;
    private String fabricante;
    private CategoriaProduto categoriaProduto;
    private BigDecimal valor;
    private int quantidade;

    public ProdutoDTO( String nome, String fabricante, CategoriaProduto categoriaProduto,BigDecimal valor, int quantidade) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.categoriaProduto = categoriaProduto;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public ProdutoDTO() {
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public CategoriaProduto getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
