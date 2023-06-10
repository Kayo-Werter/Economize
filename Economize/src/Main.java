import poo.economize.*;
import poo.economize.cadastro.CadastroUsuario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Dados dados = new Dados();

        while (true) {
            // Inicio do Sistema
            System.out.println("""
            +-----+--------------+
            |  1  |   Login      |
            |  2  |   Cadastro   |
            |  0  |   Sair       |
            +-----+--------------+
            >>>""");

            int opcao = sc.nextInt();
            sc.nextLine();
            // Login
            if (opcao == 1) {

                System.out.print("Email: ");
                var email = sc.nextLine();

                System.out.print("Senha: ");
                var senha = sc.nextLine();
                Login login = new Login(email, senha);

                if (login.authenticate(email, senha)) {
                    while (true) {
                        System.out.print("---------- Estabelecimentos mais visitados ----------\n ");
                        dados.estabelecimentosMaisVistos();
                        System.out.println("""
                         | 
                        ------------------------------------------------------
                                         Ofertas disponíveis                  
                        """);
                        dados.todasAsOfertas();
                        System.out.println("------------------------------------------------------");
                        System.out.println("\n\nEscolha um estabelecimento: ");
                        String nomeEstabelecimento = sc.nextLine();
                        dados.visualizarEstabelecimento(nomeEstabelecimento);
                        break;
                    }
                } else {
                    System.out.println("Email ou senha incorretos. Tente novamente!");
                }
            } else if (opcao == 2) {
                CadastroUsuario.cadastrar();
                System.out.println("Cadastro realizado!");
            } else if (opcao == 0) {
                break;
            }
        }
    }
}
