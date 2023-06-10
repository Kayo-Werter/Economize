package poo.economize.cadastro;

import poo.economize.Cliente;
import poo.economize.Dados;

import java.util.Scanner;

public class CadastroUsuario extends Cliente {

    public CadastroUsuario(String nome, String cpf, String telefone, String email, String senha, Endereco endereco,
                           String numCasa) {
        super(nome, cpf, telefone, email, senha, endereco, numCasa);
    }

    public static void cadastrar() {
        String nome, cpf, email, telefone, senha, confirmacaoSenha, cep, numCasa, confirma;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome Completo: ");
        nome = sc.nextLine();

        System.out.print("CPF: ");
        cpf = sc.nextLine();

        System.out.print("Telefone: ");
        telefone = sc.nextLine();

        Endereco endereco;
        while (true) {

            System.out.print("CEP: ");
            cep = sc.nextLine();
            ConsultaCep consultaCep = new ConsultaCep();
            endereco = consultaCep.buscarEndereco(cep);

            System.out.println("Endereco: " + endereco + "\n");
            System.out.print("Confirmar os dados do endereço[s/n]? ");
            confirma = sc.nextLine();

            if (confirma.equalsIgnoreCase("s")) {
                System.out.print("Informe o número do endereço: ");
                numCasa = sc.nextLine();
                break;
            } else {
                System.out.println("Informe o endereço novamente");
            }
        }

        System.out.print("Email: ");
        email = sc.nextLine();

        while (true) {
            System.out.print("Senha: ");
            senha = sc.nextLine();

            System.out.print("Confirmar Senha: ");
            confirmacaoSenha = sc.nextLine();

            if (senha.equalsIgnoreCase(confirmacaoSenha)) {
                Cliente novoCliente = new Cliente(nome, cpf, telefone, email, senha, endereco, numCasa);
                Dados.adicionarCliente(novoCliente);
                break;
            } else {
                System.out.println("Senhas divergentes! ");
            }

        }
    }

}
