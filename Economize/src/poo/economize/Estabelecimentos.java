package poo.economize;

import poo.economize.Produtos;

import java.util.ArrayList;
import java.util.List;

public class Estabelecimentos implements Comparable<Estabelecimentos> {

    private String nome;
    private String cnpj;
    private List<Produtos> listaProdutos = new ArrayList<>();
    private double visitas;

    public Estabelecimentos(String nome, String cnpj, List<Produtos> listaProdutos, double visitas) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.listaProdutos = listaProdutos;
        this.visitas = visitas;
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
    public int compareTo(Estabelecimentos outroEstabelecimento) {
        return Double.compare(this.visitas, outroEstabelecimento.visitas);
    }

    @Override
    public String toString() {
        return "Estabelecimento: " + nome + "\nCNPJ: " + cnpj;
    }

}