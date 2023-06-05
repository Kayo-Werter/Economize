import poo.economize.*;
import poo.economize.cadastro.CadastroUsuario;
import poo.economize.cadastro.ConsultaCep;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Dados dados = new Dados();

        while (true) {

            // Inicio do Sistema
            System.out.println("1 - Entrar\n2 - cadastrar");
            int busca = sc.nextInt();
            sc.nextLine();

            // Login
            if (busca == 1) {

                System.out.print("Email: ");
                var email = sc.nextLine();

                System.out.print("Senha: ");
                var senha = sc.nextLine();

                Login login = new Login(email, senha);
                System.out.println(login);
            } else if (busca == 2) {
                CadastroUsuario.cadastrar();
            }
            dados.listarClientes();

        }
    }
}

