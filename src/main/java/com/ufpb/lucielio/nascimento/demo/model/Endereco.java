package com.ufpb.lucielio.nascimento.demo.model;

public class Endereco {
    private String CEP;
    private String logradoura;
    private String UF;
    private String municipio;
    private String bairo;
    private String numeroCasa;


    public Endereco(String CEP, String logradoura, String UF, String municipio, String bairo, String numeroCasa) {
        this.CEP = CEP;
        this.logradoura = logradoura;
        this.UF = UF;
        this.municipio = municipio;
        this.bairo = bairo;
        this.numeroCasa = numeroCasa;
    }

    public Endereco() {
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getLogradoura() {
        return logradoura;
    }

    public void setLogradoura(String logradoura) {
        this.logradoura = logradoura;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getBairo() {
        return bairo;
    }

    public void setBairo(String bairo) {
        this.bairo = bairo;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
}
