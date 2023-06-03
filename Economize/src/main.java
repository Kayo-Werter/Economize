import poo.economize.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Login login = new Login("Email", "senha");

        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();



        Usuario usuario1 = new Usuario("Jany", 24, "jany@fip.com");
        System.out.println(usuario1);


    }
}
}
