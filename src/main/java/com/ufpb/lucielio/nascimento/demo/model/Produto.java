package com.ufpb.lucielio.nascimento.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String fabricante;
    @NotNull
    private Categoria categoriaProduto;
    @NotBlank
    private BigDecimal valor;
    @NotBlank
    private int quantidade;

    public Produto( String nome, String fabricante, Categoria categoriaProduto,BigDecimal valor, int quantidade) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.categoriaProduto = categoriaProduto;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public Produto() {
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

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Categoria getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(Categoria categoriaProduto) {
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

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                '}';
    }
}
