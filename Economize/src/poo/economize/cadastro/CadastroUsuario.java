package poo.economize.cadastro;

import poo.economize.Cliente;
import poo.economize.Dados;

import java.util.Scanner;

public class CadastroUsuario extends Cliente {

    private static Scanner sc = new Scanner(System.in);


    public CadastroUsuario(String nome, String cpf, String telefone, String email, String senha, String cep){
        super(nome, cpf, telefone, email, senha, cep);
    }


    public static void cadastrar(){
        String nome, cpf, email, telefone, senha, confirmacaoSenha, cep;

        System.out.print("Nome Completo: ");
        nome = sc.nextLine();

        System.out.print("CPF: ");
        cpf = sc.nextLine();

        System.out.print("Telefone: ");
        telefone = sc.nextLine();

        System.out.println("CEP: ");
        cep = sc.nextLine();


        System.out.print("Email: ");
        email = sc.nextLine();

        while (true) {
            System.out.print("Senha: ");
            senha = sc.nextLine();

            System.out.print("Confirmar Senha: ");
            confirmacaoSenha = sc.nextLine();

            if (senha.equalsIgnoreCase(confirmacaoSenha)) {
                Cliente novoCliente = new Cliente(nome, cpf, telefone, email, senha, cep);
                Dados.adicionarCliente(novoCliente);
                break;
            } else {
                System.out.println("Senhas divergentes! ");
            }

        }
    }


}







