package poo.economize;

import poo.economize.cadastro.ConsultaCep;
import poo.economize.cadastro.Endereco;

public class Cliente {
    protected String nome;
    protected String cpf;
    protected String telefone;
    protected String email;
    protected String senha;
    protected Endereco endereco;
    protected String numCasa;

    public Cliente(String nome, String cpf, String telefone, String email, String senha, Endereco endereco, String numCasa) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.numCasa = numCasa;
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

    public String getNumCasa() {
        return numCasa;
    }
}
