import poo.economize.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        try (Scanner sc = new Scanner(System.in)) {
            ArmazenamentoEstabelecimentos armazenamento = new ArmazenamentoEstabelecimentos();

            while (true) {
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Adicionar estabelecimento");
                System.out.println("2 - Remover estabelecimento");
                System.out.println("3 - Adicionar produto");
                System.out.println("4 - Remover produto");
                System.out.println("5 - Listar produtos de um estabelecimento");
                System.out.println("0 - Sair");

                int opcao = sc.nextInt();
                sc.nextLine();

                if (opcao == 0) {
                    break;
                }

                switch (opcao) {
                    case 1:
                        System.out.println("Nome do estabelecimento:");
                        String nomeEstabelecimento = sc.nextLine();
                        System.out.println("CNPJ do estabelecimento:");
                        String cnpjEstabelecimento = sc.nextLine();
                        Estabelecimentos estabelecimento = new Estabelecimentos(nomeEstabelecimento, cnpjEstabelecimento);
                        armazenamento.adicionarEstabelecimento(estabelecimento);
                        System.out.println("Estabelecimento adicionado com sucesso!");
                        break;
                    case 2:
                        System.out.println("Nome do estabelecimento:");
                        nomeEstabelecimento = sc.nextLine();
                        estabelecimento = armazenamento.buscarEstabelecimento(nomeEstabelecimento);
                        if (estabelecimento == null) {
                            System.out.println("Estabelecimento não encontrado!");
                        } else {
                            armazenamento.removerEstabelecimento(estabelecimento);
                            System.out.println("Estabelecimento removido com sucesso!");
                        }
                        break;
                    case 3:
                        System.out.println("Nome do estabelecimento:");
                        nomeEstabelecimento = sc.nextLine();
                        estabelecimento = armazenamento.buscarEstabelecimento(nomeEstabelecimento);
                        if (estabelecimento == null) {
                            System.out.println("Estabelecimento não encontrado!");
                        } else {
                            System.out.println("Nome do produto:");
                            String nomeProduto = sc.nextLine();
                            System.out.println("Preço do produto:");
                            double precoProduto = sc.nextDouble();
                            sc.nextLine();
                            Produtos produto = new Produtos(nomeProduto, nomeEstabelecimento, precoProduto, opcao);
                            estabelecimento.adicionarProduto(produto);
                            System.out.println("Produto adicionado com sucesso!");
                        }
                        break;
                    case 4:
                        System.out.println("Nome do estabelecimento:");
                        nomeEstabelecimento = sc.nextLine();
                        estabelecimento = armazenamento.buscarEstabelecimento(nomeEstabelecimento);
                        if (estabelecimento == null) {
                            System.out.println("Estabelecimento não encontrado!");
                        } else {
                            System.out.println("Nome do produto:");
                            String nomeProduto = sc.nextLine();
                            System.out.println("Preço do produto:");
                            double precoProduto = sc.nextDouble();
                            sc.nextLine();
                            Produtos produto = new Produtos(nomeProduto, nomeEstabelecimento, precoProduto, opcao);
                            estabelecimento.removerProduto(produto);
                            System.out.println("Produto removido com sucesso!");
                        }
                        break;
                    case 5:
                        System.out.println("Nome do estabelecimento:");
                        nomeEstabelecimento = sc.nextLine();
                        estabelecimento = armazenamento.buscarEstabelecimento(nomeEstabelecimento);
                        if (estabelecimento == null) {
                            System.out.println("Estabelecimento não encontrado!");
                        } else {
                            estabelecimento.listarProdutos(nomeEstabelecimento);
                        }
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            }
        }
    }
}

