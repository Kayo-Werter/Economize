package poo.economize;

import poo.economize.cadastro.ConsultaCep;
import poo.economize.cadastro.Endereco;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String senha;
    private Endereco endereco;
    private String cep;

    public Cliente(String nome, String cpf, String telefone, String email, String senha, String cep) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.cep = cep;

        ConsultaCep consultaCep = new ConsultaCep();
        this.endereco = consultaCep.buscarEndereco(cep);
    }

    public boolean authenticate(String email, String senha) {
        boolean isAuthenticated = getEmail().equalsIgnoreCase(email) && getSenha().equalsIgnoreCase(senha);
        if (isAuthenticated) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Endereço de email ou senha inválidos.");
        }
        return isAuthenticated;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getCep() {
        return cep;
    }
}
