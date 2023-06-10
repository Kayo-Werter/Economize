package poo.economize;

import poo.economize.Produtos;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Estabelecimentos implements Comparable<Estabelecimentos> {

    private String nome;
    private String cnpj;
    private List<Produtos> listaProdutos;
    private double visitas;
    private Locale localeBR;

    public Estabelecimentos(String nome, String cnpj, List<Produtos> listaProdutos, double visitas) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.listaProdutos = listaProdutos;
        this.visitas = visitas;
        this.localeBR = new Locale("pt", "BR");
    }

    public String getNome() {
        return nome;
    }

    public List<Produtos> getListaProdutos() {
        return listaProdutos;
    }

    public void produtosEmOferta () {
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

        for (Produtos produto : listaProdutos) {
            if (produto.getCategoria().equalsIgnoreCase("Grãos")) {
                double oferta = produto.getValor() - produto.getValor() * 0.3;

                System.out.println(produto.getNome() + " " + produto.getMarca() + " de: R$" + produto.getValor() +
                        " por: R$" + dinheiro.format(oferta));
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
        if (this.visitas > outroEstabelecimento.visitas) {
            return -1;
        } else if (this.visitas < outroEstabelecimento.visitas) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Estabelecimento: " + nome + "\nCNPJ: " + cnpj;
    }
}
