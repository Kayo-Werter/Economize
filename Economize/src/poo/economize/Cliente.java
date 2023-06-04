package poo.economize;

import poo.economize.cadastro.Endereco;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String senha;
    private Endereco endereco;
    private String cep;

    public Cliente(String nome, String cpf, String telefone, String email, String senha, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
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
