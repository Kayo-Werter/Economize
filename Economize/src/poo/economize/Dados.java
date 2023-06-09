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

    public static List<Estabelecimentos> getListaEstabelecimentos() {
        return listaEstabelecimentos;
    }

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

    public void todasAsOfertas(){
        for (Estabelecimentos estabelecimento : listaEstabelecimentos) {
            System.out.println("\n               Supermercado " + estabelecimento.getNome());
            estabelecimento.produtosEmOferta();

        }
    }

    public void estabelecimentosMaisVistos() {

        Collections.sort(listaEstabelecimentos);
        for (Estabelecimentos estabelecimento : listaEstabelecimentos) {
            System.out.print(" | " + estabelecimento.getNome());
        }
    }
    
    public void dadosEconomize() {
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
        Produtos queijoIsisAtacadao = new Produtos("Queijo Mussarela", "Isis", 39.99, "Lácteo");
        Produtos queijoNatvilleAtacadao = new Produtos("Queijo Mussarela", "NatVille", 43.75, "Lácteo");
        Produtos leiteBetaniaAtacadao = new Produtos("Leite em pó integral 200mg", "Betânia", 6.50, "Lácteo");
        Produtos leiteItambeAtacadao = new Produtos("Leite em pó integral 200mg", "Itambé", 6.98, "Lácteo");
        Produtos arrozBrancoAtacadao = new Produtos("Arroz Branco 5Kg", "Tio João", 36.90, "Grãos");
        Produtos arrozCamilAtacadao = new Produtos("Arroz Branco Tipo 1 1Kg", "Camil", 4.99, "Grãos");
        Produtos arrozUrbanoAtacadao = new Produtos("Arroz Branco Tipo 1 1Kg", "Urbano", 4.48, "Grãos");
        Produtos feijaoCariocaAtacadao = new Produtos("Feijão Carioca 1Kg", "Camil", 9.39, "Grãos");
        Produtos feijaoUrbanoAtacadao = new Produtos("Feijão Carioca 1Kg", "Urbano", 9.95, "Grãos");
        Produtos feijaoKicaldoaAtacadao = new Produtos("Feijão Carioca 1Kg", "Kicaldo", 11.01, "Grãos");
        Produtos macarraoEstrelagostosaAtacadao = new Produtos("Macarrão Espaguete 400mg", "Estrela Gostosa", 2.78, "Mercearia");
        Produtos macarraoAliancaAtacadao = new Produtos("Macarrão Espaguete 400mg", "Aliança", 3.09, "Mercearia");
        Produtos macarraoIntegralAtacadao = new Produtos("Macarrão Espaguete de Arroz Integral pacote 500g", "Urbano",
                5.42, "Massas");
        Produtos molhoTomateTradicionalAtacadao = new Produtos("Molho de Tomate Tradicional sachê 300g", "Quero", 1.89,
                "Molho");
        Produtos cafeSantaClaraAtacadao = new Produtos("Café Tradicional Torrado e Moído 250mg", "Santa Clara", 6.99, "Mercearia");
        Produtos cafeMarataAtacadao = new Produtos("Café Tradicional Torrado e Moído 250mg", "Maratá", 6.79, "Mercearia");
        Produtos oleoAbcAtacadao = new Produtos("Óleo de soja 900ml", "ABC", 6.99, "Mercearia");
        Produtos oleoSoyaAtacadao = new Produtos("Óleo de soja 900ml", "Soya", 7.39, "Mercearia");
        Produtos vodkaOrloffAtacadao = new Produtos("Vodka garrafa 1,75 Litros", "Orloff", 42.90, "Destilados");
        Produtos sabonetePalmoliveAtacadao = new Produtos("Sabonte 85g", "Palmolive", 3.16, "Produtos de Higiene Pessoal");
        Produtos saboneteLaraAtacadao = new Produtos("Sabonete 85g", "Lara", 2.71, "Produtos de Higiene Pessoal");
        Produtos sabaobarraAtacadao = new Produtos("Sabão em Barra Glicerinado 900g", "Ypê", 11.69, "Produtos de Limpeza");
        Produtos amaciantedeRoupasAtacadao = new Produtos("Amaciante de Roupas 2 Litros", "Ypê", 7.98, "Produtos de Limpeza");

        listaProdutosAtacadao.add(queijoIsisAtacadao);
        listaProdutosAtacadao.add(queijoNatvilleAtacadao);
        listaProdutosAtacadao.add(leiteBetaniaAtacadao);
        listaProdutosAtacadao.add(leiteItambeAtacadao);
        listaProdutosAtacadao.add(arrozBrancoAtacadao);
        listaProdutosAtacadao.add(arrozCamilAtacadao);
        listaProdutosAtacadao.add(arrozUrbanoAtacadao);
        listaProdutosAtacadao.add(feijaoCariocaAtacadao);
        listaProdutosAtacadao.add(feijaoUrbanoAtacadao);
        listaProdutosAtacadao.add(feijaoKicaldoaAtacadao);
        listaProdutosAtacadao.add(macarraoEstrelagostosaAtacadao);
        listaProdutosAtacadao.add(macarraoAliancaAtacadao);
        listaProdutosAtacadao.add(macarraoIntegralAtacadao);
        listaProdutosAtacadao.add(molhoTomateTradicionalAtacadao);
        listaProdutosAtacadao.add(cafeSantaClaraAtacadao);
        listaProdutosAtacadao.add(cafeMarataAtacadao);
        listaProdutosAtacadao.add(oleoAbcAtacadao);
        listaProdutosAtacadao.add(oleoSoyaAtacadao);
        listaProdutosAtacadao.add(vodkaOrloffAtacadao);
        listaProdutosAtacadao.add(sabonetePalmoliveAtacadao);
        listaProdutosAtacadao.add(saboneteLaraAtacadao);
        listaProdutosAtacadao.add(sabaobarraAtacadao);
        listaProdutosAtacadao.add(amaciantedeRoupasAtacadao);

        Estabelecimentos atacadao = new Estabelecimentos("Atacadão", "75.315.333/0199-85", listaProdutosAtacadao, 3);

        // Produtos Hyper
        List<Produtos> listaProdutosHyper= new ArrayList<>();
        Produtos queijoIsisHyper = new Produtos("Queijo Prato", "Isis", 20.99, "Lácteo");
        Produtos queijoNatvilleHyper = new Produtos("Queijo Prato", "NatVille", 49.99, "Lácteo");
        Produtos leiteBetaniaHyper = new Produtos("Leite em pó integral 200mg", "Betânia", 6.50, "Lácteo");
        Produtos leiteItambeHyper = new Produtos("Leite em pó integral 200mg", "Itambé", 6.98, "Lácteo");
        Produtos arrozBrancoHyper = new Produtos("Arroz Branco 5Kg", "Tio João", 36.90, "Grãos");
        Produtos arrozCamilHyper = new Produtos("Arroz Branco Tipo 1 1Kg", "Camil", 4.99, "Grãos");
        Produtos arrozUrbanoHyper = new Produtos("Arroz Branco Tipo 1 1Kg", "Urbano", 4.48, "Grãos");
        Produtos arrozParboilizadoTioHyper = new Produtos("Arroz Parboilizado T1 1Kg", "Butui", 5.99, "Grãos");
        Produtos feijaoCariocaHyper = new Produtos("Feijão Carioca 1Kg", "Camil", 9.39, "Grãos");
        Produtos feijaoUrbanoHyper = new Produtos("Feijão Carioca 1Kg", "Urbano", 9.95, "Grãos");
        Produtos feijaoKicaldoHyper = new Produtos("Feijão Carioca 1Kg", "Kicaldo", 11.01, "Grãos");
        Produtos macarraoEstrelagostosaHyper = new Produtos("Macarrão Espaguete 400mg", "Estrela Gostosa", 2.78, "Mercearia");
        Produtos macarraoAliancaHyper = new Produtos("Macarrão Espaguete 400mg", "Aliança", 3.09, "Mercearia");
        Produtos macarraoIntegralHyper = new Produtos("Macarrão Espaguete de Arroz Integral pacote 500g", "Urbano", 5.42,
                "Massas");
        Produtos molhoTomateTradicionalHyper = new Produtos("Molho de Tomate Tradicional sachê 300g", "Quero", 1.89, "Molho");
        Produtos cafeSantaClaraHyper = new Produtos("Café Tradicional Torrado e Moído 250mg", "Santa Clara", 6.99, "Mercearia");
        Produtos cafeMarataHyper = new Produtos("Café Tradicional Torrado e Moído 250mg", "Maratá", 6.79, "Mercearia");
        Produtos oleoAbcHyper = new Produtos("Óleo de soja 900ml", "ABC", 6.99, "Mercearia");
        Produtos oleoSoyaHyper = new Produtos("Óleo de soja 900ml", "Soya", 7.39, "Mercearia");
        Produtos vodkaOrloffHyper = new Produtos("Vodka garrafa 1,75 Litros", "Orloff", 42.90, "Destilados");
        Produtos sabonetePalmoliveHyper = new Produtos("Sabonte 85g", "Palmolive", 3.16, "Produtos de Higiene Pessoal");
        Produtos saboneteLaraHyper = new Produtos("Sabonete 85g", "Lara", 2.71, "Produtos de Higiene Pessoal");
        Produtos sabaobarraHyper = new Produtos("Sabão em Barra Glicerinado 900g", "Ypê", 11.69, "Produtos de Limpeza");
        Produtos amaciantedeRoupasHyper = new Produtos("Amaciante de Roupas 2 Litros", "Ypê", 7.98, "Produtos de Limpeza");

        listaProdutosHyper.add(queijoIsisHyper);
        listaProdutosHyper.add(queijoNatvilleHyper);
        listaProdutosHyper.add(leiteBetaniaHyper);
        listaProdutosHyper.add(leiteItambeHyper);
        listaProdutosHyper.add(arrozBrancoHyper);
        listaProdutosHyper.add(arrozCamilHyper);
        listaProdutosHyper.add(arrozUrbanoHyper);
        listaProdutosHyper.add(arrozParboilizadoTioHyper);
        listaProdutosHyper.add(feijaoCariocaHyper);
        listaProdutosHyper.add(feijaoUrbanoHyper);
        listaProdutosHyper.add(feijaoKicaldoHyper);
        listaProdutosHyper.add(macarraoEstrelagostosaHyper);
        listaProdutosHyper.add(macarraoAliancaHyper);
        listaProdutosHyper.add(macarraoIntegralHyper);
        listaProdutosHyper.add(molhoTomateTradicionalHyper);
        listaProdutosHyper.add(cafeSantaClaraHyper);
        listaProdutosHyper.add(cafeMarataHyper);
        listaProdutosHyper.add(oleoAbcHyper);
        listaProdutosHyper.add(oleoSoyaHyper);
        listaProdutosHyper.add(vodkaOrloffHyper);
        listaProdutosHyper.add(sabonetePalmoliveHyper);
        listaProdutosHyper.add(saboneteLaraHyper);
        listaProdutosHyper.add(sabaobarraHyper);
        listaProdutosHyper.add(amaciantedeRoupasHyper);

        Estabelecimentos hyper = new Estabelecimentos("Hyper Queiroz", "10.670.811/0008-20", listaProdutosHyper, 2);

        // Produtos Guedes
        List<Produtos> listaProdutosGuedes = new ArrayList<>();
        Produtos queijoIsisGuedes = new Produtos("Queijo Minas", "Isis", 26.00, "Lácteo");
        Produtos queijoNatvilleGuedes = new Produtos("Queijo Minas", "NatVille", 45.90, "Lácteo");
        Produtos leiteBetaniaGuedes = new Produtos("Leite em pó integral 200mg", "Betânia", 6.50, "Lácteo");
        Produtos leiteItambeGuedes = new Produtos("Leite em pó integral 200mg", "Itambé", 6.98, "Lácteo");
        Produtos arrozBrancoGuedes = new Produtos("Arroz Branco 5Kg", "Tio João", 36.90, "Grãos");
        Produtos arrozCamilGuedes = new Produtos("Arroz Branco Tipo 1 1Kg", "Camil", 4.99, "Grãos");
        Produtos arrozUrbanoGuedes = new Produtos("Arroz Branco Tipo 1 1Kg", "Urbano", 4.48, "Grãos");
        Produtos arrozParboilizadoTioGuedes = new Produtos("Arroz Parboilizado T1 1Kg", "Butui", 5.99, "Grãos");
        Produtos feijaoCariocaGuedes = new Produtos("Feijão Carioca 1Kg", "Camil", 9.39, "Grãos");
        Produtos feijaoUrbanoGuedes = new Produtos("Feijão Carioca 1Kg", "Urbano", 9.95, "Grãos");
        Produtos feijaoKicaldoGuedes = new Produtos("Feijão Carioca 1Kg", "Kicaldo", 11.01, "Grãos");
        Produtos macarraoEstrelagostosaGuedes = new Produtos("Macarrão Espaguete 400mg", "Estrela Gostosa", 2.78, "Mercearia");
        Produtos macarraoAliancaGuedes = new Produtos("Macarrão Espaguete 400mg", "Aliança", 3.09, "Mercearia");
        Produtos macarraoIntegralGuedes = new Produtos("Macarrão Espaguete de Arroz Integral pacote 500g", "Urbano", 5.42,
                "Massas");
        Produtos molhoTomateTradicionalGuedes = new Produtos("Molho de Tomate Tradicional sachê 300g", "Quero", 1.89, "Molho");
        Produtos cafeSantaClaraGuedes = new Produtos("Café Tradicional Torrado e Moído 250mg", "Santa Clara", 6.99, "Mercearia");
        Produtos cafeMarataGuedes = new Produtos("Café Tradicional Torrado e Moído 250mg", "Maratá", 6.79, "Mercearia");
        Produtos oleoAbcGuedes = new Produtos("Óleo de soja 900ml", "ABC", 6.99, "Mercearia");
        Produtos oleoSoyaGuedes = new Produtos("Óleo de soja 900ml", "Soya", 7.39, "Mercearia");
        Produtos vodkaOrloffGuedes = new Produtos("Vodka garrafa 1,75 Litros", "Orloff", 42.90, "Destilados");
        Produtos sabonetePalmoliveGuedes = new Produtos("Sabonte 85g", "Palmolive", 3.16, "Produtos de Higiene Pessoal");
        Produtos saboneteLaraGuedes = new Produtos("Sabonete 85g", "Lara", 2.71, "Produtos de Higiene Pessoal");
        Produtos sabaobarraGuedes = new Produtos("Sabão em Barra Glicerinado 900g", "Ypê", 11.69, "Produtos de Limpeza");
        Produtos amaciantedeRoupasGuedes = new Produtos("Amaciante de Roupas 2 Litros", "Ypê", 7.98, "Produtos de Limpeza");

        listaProdutosGuedes.add(queijoIsisGuedes);
        listaProdutosGuedes.add(queijoNatvilleGuedes);
        listaProdutosGuedes.add(leiteBetaniaGuedes);
        listaProdutosGuedes.add(leiteItambeGuedes);
        listaProdutosGuedes.add(arrozBrancoGuedes);
        listaProdutosGuedes.add(arrozCamilGuedes);
        listaProdutosGuedes.add(arrozUrbanoGuedes);
        listaProdutosGuedes.add(arrozParboilizadoTioGuedes);
        listaProdutosGuedes.add(feijaoCariocaGuedes);
        listaProdutosGuedes.add(feijaoUrbanoGuedes);
        listaProdutosGuedes.add(feijaoKicaldoGuedes);
        listaProdutosGuedes.add(macarraoEstrelagostosaGuedes);
        listaProdutosGuedes.add(macarraoAliancaGuedes);
        listaProdutosGuedes.add(macarraoIntegralGuedes);
        listaProdutosGuedes.add(molhoTomateTradicionalGuedes);
        listaProdutosGuedes.add(cafeSantaClaraGuedes);
        listaProdutosGuedes.add(cafeMarataGuedes);
        listaProdutosGuedes.add(oleoAbcGuedes);
        listaProdutosGuedes.add(oleoSoyaGuedes);
        listaProdutosGuedes.add(vodkaOrloffGuedes);
        listaProdutosGuedes.add(sabonetePalmoliveGuedes);
        listaProdutosGuedes.add(saboneteLaraGuedes);
        listaProdutosGuedes.add(sabaobarraGuedes);
        listaProdutosGuedes.add(amaciantedeRoupasGuedes);

        Estabelecimentos guedes = new Estabelecimentos("Guedes", "09.275.132/0001-09", listaProdutosGuedes, 1);

        listaEstabelecimentos.add(atacadao);
        listaEstabelecimentos.add(hyper);
        listaEstabelecimentos.add(guedes);
    }
}
