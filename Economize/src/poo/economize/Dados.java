package poo.economize;

import poo.economize.cadastro.ConsultaCep;
import poo.economize.cadastro.Endereco;
import java.util.Collections;

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

    public List<Estabelecimentos> getListaEstabelecimentos() {
        return listaEstabelecimentos;
    }

//    public void listarEstabelecimentos() {
//
//        Collections.sort(listaEstabelecimentos);
//        for (Estabelecimentos estabelecimento : listaEstabelecimentos) {
//
//            System.out.println("\n| Supermercado: " + estabelecimento.getNome() +
//                    "\n\n----- PRODUTOS -----: ");
//            estabelecimento.visualizarProdutos();
//        }
//    }

    public void visualizarEstabelecimento(String nomeEstabelecimento) {

        for (Estabelecimentos estabelecimento : listaEstabelecimentos) {

            if (nomeEstabelecimento.equalsIgnoreCase(estabelecimento.getNome())) {
                System.out.println("\n *************** " + estabelecimento.getNome() + " *************** ");
                System.out.println("\n ----- Produtos em oferta ----- \n");

                estabelecimento.produtosEmOferta();

                System.out.println("\n\n----- PRODUTOS ----- ");
                estabelecimento.visualizarProdutos();

            }

        }
    }

    public void estabelecimentosMaisVistos() {

        Collections.sort(listaEstabelecimentos);
        for (Estabelecimentos estabelecimento : listaEstabelecimentos) {

            System.out.print(" --- " + estabelecimento.getNome());
        }
    }

    public void listarClientes() {
        for (Cliente listaCliente : listaClientes) {

            System.out.println("| Nome: " + listaCliente.getNome() +
                    " | Email: " + listaCliente.getEmail() +
                    " | Contato: " + listaCliente.getTelefone() +
                    " | CPF: " + listaCliente.getCpf() + "\n" +
                    "Endereco: " + listaCliente.getEndereco() +
                    " - N° " + listaCliente.getNumCasa() + "\n");
        }
    }

    public static void dadosEconomize() {
        ConsultaCep consultaCep = new ConsultaCep();
        enderecoTeste = consultaCep.buscarEndereco("58704440");

        // NÃO MUDAR NADA
        Cliente pablo = new Cliente("pablo", "123.123.434-34", "4002-8922", "pablo@ads.com", "12", enderecoTeste, "10");
        Cliente jany = new Cliente("jany", "847.923.456-34", "3421-8922", "jany@ads.com", "123", enderecoTeste, "12");
        Cliente clark = new Cliente("clark", "564.564.234-23", "9834-8922", "clark@ads.com", "1234", enderecoTeste, "19");
        listaClientes.add(pablo);
        listaClientes.add(jany);
        listaClientes.add(clark);

        // Produtos ATACADAO
        List<Produtos> listaProdutosAtacadao = new ArrayList<>();
        Produtos queijoIsisAtacadao = new Produtos("Queijo Mussarela", "Isis", 39.99, 34, "Lácteo");
        Produtos queijoNatvilleAtacadao = new Produtos("Queijo Mussarela", "NatVille", 43.75, 32, "Lácteo");
        Produtos arrozBrancoAtacadao = new Produtos("Arroz Branco 5Kg", "Tio João", 36.90, 80, "Grãos");
        Produtos feijaoCariocaAtacadao = new Produtos("Feijão Carioca 1Kg", "Camil", 9.39, 55, "Grãos");
        Produtos vodkaOrloffAtacadao = new Produtos("Vodka garrafa 1,75 Litros", "Orloff", 42.90, 15, "Destilados");
        Produtos sabaobarraAtacadao = new Produtos("Sabão em Barra Glicerinado 900g", "Ypê", 11.69, 1,
                "Produtos de Limpeza");
        Produtos amaciantedeRoupasAtacadao = new Produtos("Amaciante de Roupas 2 Litros", "Ypê", 7.98, 1,
                "Produtos de Limpeza");

        listaProdutosAtacadao.add(queijoIsisAtacadao);
        listaProdutosAtacadao.add(queijoNatvilleAtacadao);
        listaProdutosAtacadao.add(arrozBrancoAtacadao);
        listaProdutosAtacadao.add(feijaoCariocaAtacadao);
        listaProdutosAtacadao.add(vodkaOrloffAtacadao);
        listaProdutosAtacadao.add(sabaobarraAtacadao);
        listaProdutosAtacadao.add(amaciantedeRoupasAtacadao);

        Estabelecimentos atacadao = new Estabelecimentos("Atacadão", "75.315.333/0199-85", listaProdutosAtacadao, 3);

        // Produtos Hyper
        List<Produtos> listaProdutosHyper = new ArrayList<>();
        Produtos queijoIsisHyper = new Produtos("Queijo Prato", "Isis", 20.99, 35, "Lácteo");
        Produtos queijoNatvilleHyper = new Produtos("Queijo Prato", "NatVille", 49.99, 33, "Lácteo");
        Produtos arrozParboilizadoTioHyper = new Produtos("Arroz Parboilizado T1 1Kg", "Butui", 5.99, 1, "Grãos");
        Produtos arrozBrancoHyper = new Produtos("Arroz Branco 5Kg", "Tio João", 36.90, 80, "Grãos");
        Produtos feijaoCariocaHyper = new Produtos("Feijão Carioca 1Kg", "Camil", 9.39, 55, "Grãos");
        Produtos vodkaOrloffHyper = new Produtos("Vodka garrafa 1,75 Litros", "Orloff", 42.90, 15, "Destilados");
        Produtos oleodeSojaHyper = new Produtos("Óleo de Soja pet 900ml", "Liza", 6.33, 1, "Óleo");

        listaProdutosHyper.add(queijoIsisHyper);
        listaProdutosHyper.add(queijoNatvilleHyper);
        listaProdutosHyper.add(arrozBrancoHyper);
        listaProdutosHyper.add(arrozParboilizadoTioHyper);
        listaProdutosHyper.add(feijaoCariocaHyper);
        listaProdutosHyper.add(vodkaOrloffHyper);
        listaProdutosHyper.add(oleodeSojaHyper);

        Estabelecimentos hyper = new Estabelecimentos("Hyper Queiroz", "10.670.811/0008-20", listaProdutosHyper, 2);

        // Produtos Guedes
        List<Produtos> listaProdutosGuedes = new ArrayList<>();
        Produtos queijoIsisGuedes = new Produtos("Queijo Minas", "Isis", 26.00, 36, "Lácteo");
        Produtos queijoNatvilleGuedes = new Produtos("Queijo Minas", "NatVille", 45.90, 38, "Lácteo");
        Produtos arrozBrancoGuedes = new Produtos("Arroz Branco 5Kg", "Tio João", 35.49, 80, "Grãos");
        Produtos feijaoCariocaGuedes = new Produtos("Feijão Carioca 1Kg", "Camil", 9.39, 55, "Grãos");
        Produtos vodkaOrloffGuedes = new Produtos("Vodka garrafa 1,75 Litros", "Orloff", 42.90, 15, "Destilados");
        Produtos macarraoIntegralGuedes = new Produtos("Macarrão Espaguete de Arroz Integral pacote 500g", "Urbano", 5.42,
                1, "Massas");
        Produtos molhoTomateTradicionalGuedes = new Produtos("Molho de Tomate Tradicional sachê 300g", "Quero", 1.89, 1,
                "Molho");

        listaProdutosGuedes.add(queijoIsisGuedes);
        listaProdutosGuedes.add(queijoNatvilleGuedes);
        listaProdutosGuedes.add(arrozBrancoGuedes);
        listaProdutosGuedes.add(feijaoCariocaGuedes);
        listaProdutosGuedes.add(vodkaOrloffGuedes);
        listaProdutosGuedes.add(macarraoIntegralGuedes);
        listaProdutosGuedes.add(molhoTomateTradicionalGuedes);

        Estabelecimentos guedes = new Estabelecimentos("Guedes", "09.275.132/0001-09", listaProdutosGuedes, 1);

        listaEstabelecimentos.add(atacadao);
        listaEstabelecimentos.add(hyper);
        listaEstabelecimentos.add(guedes);
    }

}
