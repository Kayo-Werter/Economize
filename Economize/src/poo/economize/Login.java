package poo.economize;

import poo.economize.Dados;

public class Login {

    public Login(String email, String senha) {
        authenticate(email, senha);
    }

    public boolean authenticate(String email, String senha) {

        boolean isAuthenticated = false;

        for (Cliente listaCliente : Dados.getListaClientes()) {
            isAuthenticated = listaCliente.getEmail().equalsIgnoreCase(email) &&
                    listaCliente.getSenha().equalsIgnoreCase(senha);
            if (isAuthenticated) {
                System.out.println("Seja bem vindo " + listaCliente.getNome() + "!");
                break;
            }
        }
        return isAuthenticated;
    }
}
