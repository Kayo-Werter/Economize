package poo.economize;

import poo.economize.cadastro.ConsultaCep;
import poo.economize.cadastro.Endereco;

import java.util.ArrayList;
import java.util.List;

public class Dados {

    private static List<Cliente> listaClientes= new ArrayList<>();

    public Dados() {
        dadosEconomize();
    }

    public static void adicionarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void dadosEconomize() {

        Cliente pablo = new Cliente("pablo",  "123.123.434-34", "4002-8922", "pablo@ads.com", "1234", "58704440");
        Cliente jany = new Cliente("jany", "847.923.456-34", "3421-8922", "jany@ads.com", "12345", "58701068");
        Cliente clark = new Cliente("clark", "564.564.234-23", "9834-8922", "clark@ads.com", "123456", "58701070");

        listaClientes.add(pablo);
        listaClientes.add(jany);
        listaClientes.add(clark);
    }

    public void listarClientes() {
        System.out.println("Clientes cadastrados: " + listaClientes.size());

        for (Cliente listaCliente : listaClientes) {

            System.out.println("| Nome: " + listaCliente.getNome() +
                    " | Email: " + listaCliente.getEmail() +
                    " | Contato: " + listaCliente.getTelefone() +
                    " | CPF: " + listaCliente.getCpf() + "\n" +
                    "Endereco: " + listaCliente.getEndereco() + "\n");
        }
    }
}
