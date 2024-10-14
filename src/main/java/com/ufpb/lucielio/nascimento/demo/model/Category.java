package com.ufpb.lucielio.nascimento.demo.model;

import jakarta.persistence.Entity;

import java.util.Objects;


public class Category {
    private Long id;
    private String nome;

    public Category(){}

    public Category(String nome) {
        super();
        this.nome = nome;
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(nome, category.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
