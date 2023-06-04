package poo.economize;

import java.util.ArrayList;
import java.util.List;

public class Dados {

    private static List<Cliente> listaClientes= new ArrayList<>();

    public Dados() {
        dadosPadaria();
    }

    public static void adicionarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void dadosPadaria() {
        Cliente pablo = new Cliente("pablo",  "12312343434", "4002-8922", "pablo@ads.com");
        Cliente jany = new Cliente("jany", "847.923.456-34", "3421-8922", "jany@ads.com");
        Cliente clark = new Cliente("clark", "564.564.234-23", "9834-8922", "clark@ads.com");

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
                    " | CPF: " + listaCliente.getCpf());
        }
    }
}
