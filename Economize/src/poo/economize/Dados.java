package poo.economize;

import poo.economize.cadastro.ConsultaCep;
import poo.economize.cadastro.Endereco;


import java.util.ArrayList;
import java.util.List;

public class Dados {
    private static Endereco enderecoTeste;
    private static List<Cliente> listaClientes = new ArrayList<>();
    private static List<Estabelecimentos> listaEstabelecimentos = new ArrayList<>();
    private static List<Produtos> listaProdutos = new ArrayList<>();

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



        Estabelecimentos atacadao = new Estabelecimentos("Atacadão", "75.315.333/0199-85", );

        
        Estabelecimentos hyper = new Estabelecimentos("Hyper Queiroz", "10.670.811/0008-20");


        Produtos queijoIsisGuedes = new Produtos("Queijo Mussarela", "Isis", 39.99, 34, "Lácteo");
        Produtos queijoNatvilleGuedes = new Produtos("Queijo Mussarela", "NatVille", 43.75, 32, "Lácteo");
        listaProdutos.add(queijoNatvilleGuedes);
        listaProdutos.add(queijoIsisGuedes);

        Estabelecimentos guedes = new Estabelecimentos("Guedes", "09.275.132/0001-09", listaProdutos);

        listaEstabelecimentos.add(atacadao);
        listaEstabelecimentos.add(hyper);
        listaEstabelecimentos.add(guedes);




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
