package poo.economize;

public class Login extends CadastroUsuario {

    private String senha;

    public Login(String email, String senha) {
        super(email);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public boolean authenticate(String enteredUsername, String enteredPassword) {
        return getEmail().equals(enteredUsername) && senha.equals(enteredPassword);

        if (isAuthenticated) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Endereço de o email ou senha inválidos.");
        }

        Login login = new Login("usuario@example.com", "senha123");
        boolean isAuthenticated = login.authenticate("usuario@example.com", "senha123");
        if (isAuthenticated) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Endereço de email ou senha inválidos.");
        }
    }
}

