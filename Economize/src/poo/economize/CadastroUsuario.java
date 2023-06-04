package poo.economize;

import java.util.Scanner;

public class CadastroUsuario {
    private String nome;
    private String cpf;
    private int telefone;
    private String email;
    private static Scanner sc = new Scanner(System.in);


    public CadastroUsuario(String nome, String cpf, int telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public CadastroUsuario(String email) {
        this.email = email;
    }

    public static void cadastrar(){
        String nome, cpf, senha, email, telefone;

        System.out.print("Nome Completo: ");
        nome = sc.nextLine();

        System.out.print("CPF: ");
        cpf = sc.nextLine();

        System.out.print("Telefone: ");
        telefone = sc.nextLine();

        System.out.print("Email: ");
        email = sc.nextLine();

        Cliente novoCliente = new Cliente(nome, cpf, telefone, email);

        Dados.adicionarCliente(novoCliente);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Usuário: " + nome +
                "\nCPF: " + cpf +
                "\nTelefone: " + telefone +
                "\nEmail: " + email;
    }
}







