package poo.economize;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Estabelecimentos {

    private List<Estabelecimento> listaEstabelecimentos;
    private String nome;
    private String cnpj;
    private List<Produtos> produtos;

    public void cadastroEstabelecimentos(String nome, String cnpj) {
        this.listaestabelecimento = new ArrayList<>();
        this.nome = nome;
        this.cnpj = cnpj;
        this.produtos = new ArrayList<>();
    }

    Scanner sc = new Scanner(System.in);

    System.out.println("Nome: ");
    nome = sc.nextLine();

    System.out.println("CNPJ: ");
    cnpj = sc.nextLine();

}
    public void adicionarProdutos(Produtos produtos) {
        produtos.add(produtos);
    }

    public void removerProdutos(Produtos produtos) {
        produtos.remove(produtos);
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void listarProdutos() {
        System.out.println("Produtos disponíveis no supermercado " + nome + ":");
        for (Produtos produtos : produtos) {
            System.out.println(produtos.getNome() + " - R$" + produtos.getPreco());
            preço = sc.nextDouble();
        }
    }
}
