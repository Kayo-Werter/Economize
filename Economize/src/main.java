import poo.economize.*;
import poo.economize.cadastro.CadastroUsuario;
import poo.economize.cadastro.ConsultaCep;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {



        Dados dados = new Dados();

        // Variáveis
        int opcao;
        String email;
        String senha;

        Scanner sc = new Scanner(System.in);

        // Inicio do Sistema
        System.out.println("1 - Entrar\n2 - cadastrar");
        opcao = sc.nextInt();
        sc.nextLine();

        // Login
        if (opcao == 1) {
            System.out.print("Email: ");
            email = sc.nextLine();

            System.out.print("Senha: ");
            senha = sc.nextLine();

            Login login = new Login(email, senha);

            // Cadastro
        } else if (opcao == 2) {
            CadastroUsuario.cadastrar();
        }
        dados.listarClientes();


    }
}

