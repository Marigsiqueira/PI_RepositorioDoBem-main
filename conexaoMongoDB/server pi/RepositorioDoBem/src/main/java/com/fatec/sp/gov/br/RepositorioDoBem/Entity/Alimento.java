package com.fatec.sp.gov.br.RepositorioDoBem.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Alimento {

    @Id
    private String alimentoId;
    private String nomeProduto;
    private String peso;
    private String dataValidade;
    private String idDoador;
    private String emailDoador;

    public Alimento(String alimentoId, String nomeProduto, String peso, String dataValidade, String idDoador, String emailDoador) {
        super();
        this.alimentoId = alimentoId;
        this.nomeProduto = nomeProduto;
        this.peso = peso;
        this.dataValidade = dataValidade;
        this.idDoador = idDoador;
        this.emailDoador = emailDoador;
    }

    public String getAlimentoId() {
        return alimentoId;
    }

    public void setAlimentoId(String alimentoId) {
        this.alimentoId = alimentoId;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getIdDoador() {
        return idDoador;
    }

    public void setIdDoador(String idDoador) {
        this.idDoador = idDoador;
    }

    public String getEmailDoador() {
        return emailDoador;
    }

    public void setEmailDoador(String emailDoador) {
        this.emailDoador = emailDoador;
    }
}
