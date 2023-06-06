package poo.economize;

import poo.economize.Dados;

public class Login {


    public Login(String email, String senha) {
        authenticate(email, senha);
    }

    public void authenticate(String email, String senha) {

        for (Cliente listaCliente : Dados.getListaClientes()) {
            boolean isAuthenticated = listaCliente.getEmail().equalsIgnoreCase(email) && listaCliente.getSenha().equalsIgnoreCase(senha);
            if (isAuthenticated) {
                System.out.println("Seja bem vindo " + listaCliente.getNome() + "!");
                break;
            }
        }
    }
}
