package poo.economize;

import poo.economize.cadastro.ConsultaCep;
import poo.economize.cadastro.Endereco;


import java.util.ArrayList;
import java.util.List;

public class Dados {
    private static Endereco enderecoTeste;
    private static List<Cliente> listaClientes = new ArrayList<>();
    private static List<Estabelecimentos> listaEstabelecimentos = new ArrayList<>();

    public Dados() {
        dadosEconomize();
    }

    public static void adicionarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public static List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public static void dadosEconomize() {
        ConsultaCep consultaCep = new ConsultaCep();
        enderecoTeste = consultaCep.buscarEndereco("58704440");

        Cliente pablo = new Cliente("pablo", "123.123.434-34", "4002-8922", "pablo@ads.com", "1234", enderecoTeste, "10");
        Cliente jany = new Cliente("jany", "847.923.456-34", "3421-8922", "jany@ads.com", "12345", enderecoTeste, "12");
        Cliente clark = new Cliente("clark", "564.564.234-23", "9834-8922", "clark@ads.com", "123456", enderecoTeste, "19");
        listaClientes.add(pablo);
        listaClientes.add(jany);
        listaClientes.add(clark);

        Estabelecimentos atacadao = new Estabelecimentos("Atacadão", "75.315.333/0199-85")
        Estabelecimentos hyper = new Estabelecimentos("Hyper Queiroz", "12.522.432/0001-80")
        Estabelecimentos guedes = new Estabelecimentos("Guedes", "12.522.469/0001-80")



    }

    public void listarClientes() {
        System.out.println("Clientes cadastrados: " + listaClientes.size());

        for (Cliente listaCliente : listaClientes) {

            System.out.println("| Nome: " + listaCliente.getNome() +
                    " | Email: " + listaCliente.getEmail() +
                    " | Contato: " + listaCliente.getTelefone() +
                    " | CPF: " + listaCliente.getCpf() + "\n" +
                    "Endereco: " + listaCliente.getEndereco() +
                    " - N° " + listaCliente.getNumCasa() + "\n");
        }
    }
}
