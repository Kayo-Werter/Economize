package poo.economize;

import poo.economize.Produtos;

import java.util.ArrayList;
import java.util.List;

public class Estabelecimentos implements Comparable<Estabelecimentos> {

    private String nome;
    private String cnpj;
    private List<Produtos> listaProdutos;
    private double visitas;

    public Estabelecimentos(String nome, String cnpj, List<Produtos> listaProdutos, double visitas) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.listaProdutos = listaProdutos;
        this.visitas = visitas;
    }



    public String getNome() {
        return nome;
    }

    public List<Produtos> getListaProdutos() {
        return listaProdutos;
    }


    public void produtosEmOferta () {
        for (Produtos produto : listaProdutos) {
            if (produto.getCategoria().equalsIgnoreCase("Lácteo")) {
                double oferta = produto.getValor() - produto.getValor() * 0.3;
                System.out.println(produto.getNome() + " " + produto.getMarca() + " de: R$" + produto.getValor() +
                        " por: R$" + oferta);
            }
        }
    }

    public void visualizarProdutos() {

        for (Produtos produto : listaProdutos) {
            System.out.println("\nNome: " + produto.getNome() +
                    "\nMarca: " + produto.getMarca() +
                    "\nValor: " + produto.getValor());
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