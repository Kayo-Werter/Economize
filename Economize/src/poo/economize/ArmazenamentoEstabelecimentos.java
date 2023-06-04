package poo.economize;
import java.util.ArrayList;
import java.util.List;


public class ArmazenamentoEstabelecimentos {
    private List<Estabelecimentos> estabelecimentos;


    public ArmazenamentoEstabelecimentos() {
        this.estabelecimentos = new ArrayList<>();
    }

    public void adicionarEstabelecimento(Estabelecimentos estabelecimento) {
        estabelecimentos.add(estabelecimento);
    }

    public void removerEstabelecimento(Estabelecimentos estabelecimento) {
        estabelecimentos.remove(estabelecimento);
    }

    public List<Estabelecimentos> getEstabelecimentos() {
        return estabelecimentos;
    }

    public Estabelecimentos buscarEstabelecimento(String nome) {
        for (Estabelecimentos estabelecimento : estabelecimentos) {
            if (estabelecimento.getNome().equals(nome)) {
                return estabelecimento;
            }
        }
        return null;
    }
}
}
