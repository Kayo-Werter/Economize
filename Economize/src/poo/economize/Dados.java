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
        ConsultaCep consultaCep = new ConsultaCep();

        Endereco enderecoPadrao = consultaCep.buscarEndereco("58701068");

        Cliente pablo = new Cliente("pablo",  "12312343434", "4002-8922", "pablo@ads.com", "1234", enderecoPadrao);
        Cliente jany = new Cliente("jany", "847.923.456-34", "3421-8922", "jany@ads.com", "12345", enderecoPadrao);
        Cliente clark = new Cliente("clark", "564.564.234-23", "9834-8922", "clark@ads.com", "123456", enderecoPadrao);

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
                    " | CPF: " + listaCliente.getCpf() +
                    " | Rua: " + listaCliente.getEndereco());
        }
    }
}
