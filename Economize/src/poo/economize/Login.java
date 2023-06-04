package poo.economize;

public class Login extends CadastroUsuario {

    private String senha;
    private boolean isAuthenticated;

    public Login(String email, String senha) {
        super(email);
        this.senha = senha;
        authenticate(email, senha);
    }

    public String getSenha() {
        return senha;
    }

    public boolean authenticate(String enteredUsername, String enteredPassword) {
        isAuthenticated = getEmail().equals(enteredUsername) && senha.equals(enteredPassword);
        if (isAuthenticated) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Endereço de email ou senha inválidos.");
        }
        return isAuthenticated;
    }

    @Override
    public String toString() {
        return getEmail();
    }
}

