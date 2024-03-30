package com.fatec.sp.gov.br.RepositorioDoBem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Controller {

    @Autowired
    @Qualifier("numeroCnpj")
    private String numeroCnpj;

    @Autowired
    @Qualifier("nomeDaEmpresa")
    private String nomeDaEmpresa;

    @Autowired
    @Qualifier("numeroCep")
    private String numeroCep;

    @Autowired
    @Qualifier("enderecoEmail")
    private String enderecoEmail;

    @Autowired
    @Qualifier("caracteresSenha")
    private String caracteresSenha;

    @Autowired
    @Qualifier("verificarLogin")
    private boolean verificarLogin;

    @GetMapping("/VerUsuario")
    public String VerUsuario(){
        return  "CNPJ: " + numeroCnpj + "\n" +
                "Nome empresa: " + nomeDaEmpresa + "\n" +
                "CEP: " + numeroCep + "\n" +
                "Email: " + enderecoEmail + "\n" +
                "Senha: " + caracteresSenha;
    }

    @GetMapping("/login")
    public boolean login(){
        return verificarLogin;
    }


}
