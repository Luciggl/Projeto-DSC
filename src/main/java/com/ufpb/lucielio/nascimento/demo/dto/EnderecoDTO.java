package com.ufpb.lucielio.nascimento.demo.dto;

public class EnderecoDTO {
    private String cep;
    private String rua;
    private String cidade;
    private String estado;
    private int numeroCasa;

    public EnderecoDTO(String cep, String rua, String cidade, String estado, int numeroCasa) {
        this.cep = cep;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.numeroCasa = numeroCasa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
}
