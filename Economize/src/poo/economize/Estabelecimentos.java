package poo.economize;

import poo.economize.ArmazenamentoEstabelecimentos;
import poo.economize.Produtos;

import java.util.ArrayList;
import java.util.List;

public class Estabelecimentos {
    private static String nome;
    private static String cnpj;
    private static List<Produtos> produtos;

    public Estabelecimentos(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.produtos = new ArrayList<>();
    }

    public static void adicionarProduto(Produtos produto) {
        produtos.add(produto);
    }

    public static void removerProduto(Produtos produto) {
        produtos.remove(produto);
    }

    public static List<Produtos> getProdutos() {
        return produtos;
    }

    @Override
    public String toString() {
        return "Estabelecimento: " + nome + "\nCNPJ: " + cnpj;
    }

    public String getNome() {
        return nome;
    }
}