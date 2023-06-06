package poo.economize;

import poo.economize.Produtos;

import java.util.ArrayList;
import java.util.List;

public class Estabelecimentos {
    private String nome;
    private String cnpj;
    private List<Produtos> listaProdutos = new ArrayList<>();

    public Estabelecimentos(String nome, String cnpj, List<Produtos> listaProdutos) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.listaProdutos = listaProdutos;
    }

    public void adicionarProduto(Produtos produto) {
        listaProdutos.add(produto);
    }

    public void removerProduto(Produtos produto) {
        listaProdutos.remove(produto);
    }

    public String getNome() {
        return nome;
    }

    public List<Produtos> getListaProdutos() {
        return listaProdutos;
    }

    public void visualizarProdutos() {

        for (Produtos listaProduto : listaProdutos) {
            System.out.println("\nNome: " + listaProduto.getNome() +
                    "\nMarca: " + listaProduto.getMarca() +
                    "\nValor: " + listaProduto.getValor());
        }
    }

    @Override
    public String toString() {
        return "Estabelecimento: " + nome + "\nCNPJ: " + cnpj;
    }


}