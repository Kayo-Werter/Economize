package poo.economize;

public class Login extends CadastroUsuario {

    private String senha;

    public void Login (String email,String senha){
        super(email);
        this.senha = senha;
    }
    public String getSenha(){
        return senha;
    }

    boolean isAuthenticated = login.authenticate(email,senha);

    public boolean authenticate(String enteredUsername, String enteredPassword) {
        return email.equals(email) && senha.equals(senha);
    }

    if (isAuthenticated) {
        System.out.println("Login bem-sucedido!");
    } else {
        System.out.println("Endereço de o email ou senha inválidos.");
    }
}
