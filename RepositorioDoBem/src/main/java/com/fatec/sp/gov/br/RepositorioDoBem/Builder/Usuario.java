package com.fatec.sp.gov.br.RepositorioDoBem.Builder;

public class Usuario {
    private final String cnpj;
    private final String nomeEmpresa;
    private final String cep;
    private final String email;
    private final String senha;


    //Construtor da classe Usuário

    private Usuario(UsuarioBuilder builder){
        this.cnpj = builder.cnpj;
        this.nomeEmpresa = builder.nomeEmpresa;
        this.cep = builder.cep;
        this.email = builder.email;
        this.senha = builder.senha;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public String getCep() {
        return cep;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String toString(){
        return "CNPJ: " + getCnpj() + '\n' +
                "Nome empresa: " + getNomeEmpresa() + '\n' +
                "CEP: " + getCep() + '\n' +
                "Email: " + getEmail() + '\n' +
                "Senha: " + getSenha();

    }

    //Método verificar usuario para login
    public boolean verificarLogin(String email, String senha){
        return this.email.equals(email) && this.senha.equals(senha);
    }


    //Builder
    public static class UsuarioBuilder{

        private String cnpj;
        private String nomeEmpresa;
        private String cep;
        private String email;
        private String senha;


        public UsuarioBuilder cnpj(String cnpj){
            this.cnpj = cnpj;
            return this;
        }

        public UsuarioBuilder nomeEmpresa(String nomeEmpresa){
            this.nomeEmpresa = nomeEmpresa;
            return this;
        }
        public UsuarioBuilder cep(String cep){
            this.cep = cep;
            return this;
        }

        public UsuarioBuilder email(String email){
            this.email = email;
            return this;
        }
        public UsuarioBuilder senha(String senha){
            this.senha = senha;
            return this;
        }

        public Usuario criarUsuario(){
            return new Usuario(this);
        }



    }
}


