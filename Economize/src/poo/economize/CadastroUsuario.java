package poo.economize;

public class CadastroUsuario {
    private String nome;
    private String cpf;
    private int telefone;
    private String email;


    public CadastroUsuario(String nome, String cpf, int telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public CadastroUsuario(String email) {
        this.email = email;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Usuário: " + nome +
                "\nCPF: " + cpf +
                "\nTelefone: " + telefone +
                "\nEmail: " + email;
    }
}







