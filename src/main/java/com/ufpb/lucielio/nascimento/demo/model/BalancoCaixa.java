package com.ufpb.lucielio.nascimento.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class BalancoCaixa{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Products produtos;
    private int quant;

    private String tipo;

    private Date date;

    SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");


    public Products getProdutos() {
        return produtos;
    }

    public int getQuant() {
        return quant;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getDate() {
        return date;
    }

    public BalancoCaixa(Products produtos, int quant, String tipo, Date date) {
        this.produtos = produtos;
        this.quant = quant;
        this.tipo = tipo;
        this.date = date;
    }

    @Override
    public String toString() {
        return
                produtos.getName() + " " + quant +
                        "\ntipo: " + tipo + "\n" +
                        dateFormat.format(date) + "\n";
    }
}