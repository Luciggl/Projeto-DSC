package com.ufpb.lucielio.nascimento.demo.model;

import com.ufpb.lucielio.nascimento.demo.enums.Status;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.List;

public class Pedidos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private Date data;
    private Status status;
    private List<Produto> produtosComprados;

    public Pedidos(Date data, Status status, List<Produto> produtos) {
        this.data = data;
        this.status = status;
        this.produtosComprados = produtos;
    }

    public Long getId() {
        return id;
    }


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Produto> getProdutosComprados() {
        return produtosComprados;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "id=" + id +
                ", data=" + data +
                ", status=" + status +
                ", produtosComprados=" + produtosComprados +
                '}';
    }
}
