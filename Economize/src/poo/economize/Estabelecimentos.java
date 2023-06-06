package poo.economize;

import poo.economize.ArmazenamentoEstabelecimentos;
import poo.economize.Produtos;

import java.util.ArrayList;
import java.util.List;

public class Estabelecimentos {
    private String nome;
    private String cnpj;
    private List<Produtos> produtos = new ArrayList<>();

    public Estabelecimentos(String nome, String cnpj, List<Produtos> produtos) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.produtos = produtos;
    }

    public void adicionarProduto(Produtos produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produtos produto) {
        produtos.remove(produto);
    }

    public List<Produtos> getProdutos() {
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