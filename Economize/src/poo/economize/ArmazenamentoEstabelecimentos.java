package poo.economize;
import java.util.ArrayList;
import java.util.List;


public class ArmazenamentoEstabelecimentos {
    private List<Estabelecimentos> listaEstabelecimento= new ArrayList<>();
    private List<Produtos> listaProdutos= new ArrayList<>();


    public void adicionarEstabelecimento(Estabelecimentos estabelecimento) {
        listaEstabelecimento.add(estabelecimento);
    }

    public void removerEstabelecimento(Estabelecimentos estabelecimento) {
        listaEstabelecimento.remove(estabelecimento);
    }

    public List<Estabelecimentos> getListaEstabelecimentos() {
        return listaEstabelecimento;
    }

    public Estabelecimentos buscarEstabelecimento(String nome) {
        for (Estabelecimentos estabelecimento : listaEstabelecimento) {
            System.out.println("| Nome: " + estabelecimento.getNome());
        }
        return null;
    }

    public void dadosEconomize() {
        Estabelecimentos e1 = new Estabelecimentos("pablo",  "12312343434");
        Estabelecimentos e2 = new Estabelecimentos("jany", "847.923.456-34");
        Estabelecimentos e3 = new Estabelecimentos("clark", "564.564.234-23");

        listaEstabelecimento.add(e1);
        listaEstabelecimento.add(e2);
        listaEstabelecimento.add(e3);
    }

    public void listarProdutos(Produtos produtos) {
        ArmazenamentoEstabelecimentos armazenamento = new ArmazenamentoEstabelecimentos();

        Estabelecimentos estabelecimento = new Estabelecimentos("asdas", "13123");

        System.out.println("Produtos disponíveis no estabelecimento " + estabelecimento.getNome() + ":");
        for (Produtos produto : estabelecimento.getProdutos()) {
            System.out.println(produto.getNome() + " - R$" + produto.getPreco());
        }
    }

    public void listarClientes() {
        System.out.println("Produtos cadastrados: " + listaProdutos.size());

        for (Produtos listaProdutos : listaProdutos) {

            System.out.println("| Nome: " + listaProdutos.getNome() +
                    " | Valor: " + listaProdutos.getValor());
        }
    }

}
