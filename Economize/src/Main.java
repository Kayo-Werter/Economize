import poo.economize.*;
import poo.economize.cadastro.CadastroUsuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Dados dados = new Dados();

        while (true) {
            // Inicio do Sistema
            System.out.println("1 - Entrar\n2 - cadastrar\n0 - Sair");
            int busca = sc.nextInt();
            sc.nextLine();
            // Login
            if (busca == 1) {

                System.out.print("Email: ");
                var email = sc.nextLine();

                System.out.print("Senha: ");
                var senha = sc.nextLine();

                Login login = new Login(email, senha);
            } else if (busca == 2) {
                CadastroUsuario.cadastrar();
                System.out.println("Cadastro realizado!");
            } else if (busca == 0) {
                break;
            }
           dados.listarClientes();

        }
    }
}
