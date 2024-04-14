package com.fatec.sp.gov.br.RepositorioDoBem.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
    @Id

    private String userId;
    private String cnpj;
    private String cep;
    private String nomeEmpresa;
    private String email;
    private String senha;

    public User(String userId, String cnpj, String cep, String nomeEmpresa, String email, String senha) {
        super();
        this.userId = userId;
        this.nomeEmpresa = nomeEmpresa;
        this.email = email;
        this.cnpj = cnpj;
        this.cep = cep;
        this.senha = senha;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
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
}
