import poo.economize.ArmazenamentoEstabelecimentos;
import poo.economize.Produtos;

import java.util.ArrayList;
import java.util.List;

public class Estabelecimentos {
    private String nome;
    private String cnpj;
    private List<Produtos> produtos;

    public Estabelecimentos(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.produtos = new ArrayList<>();
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

    public void listarProdutos(String nomeEstabelecimento) {
        ArmazenamentoEstabelecimentos armazenamento = new ArmazenamentoEstabelecimentos();
        Estabelecimentos estabelecimento = armazenamento.buscarEstabelecimento(nomeEstabelecimento);
        System.out.println("Produtos disponíveis no estabelecimento " + estabelecimento.getNome() + ":");
        for (Produtos produto : estabelecimento.getProdutos()) {
            System.out.println(produto.getNome() + " - R$" + produto.getPreco());
        }
    }

    @Override
    public String toString() {
        return "Estabelecimento: " + nome + "\nCNPJ: " + cnpj;
    }

    public String getNome() {
        return nome;
    }
}