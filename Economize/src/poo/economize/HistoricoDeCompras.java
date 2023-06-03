package poo.economize;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class HistoricoDeCompras {
    private List<Compras> compras;

    public HistoricoDeCompras() {
        compras = new ArrayList<>();
    }

    public void adicionarCompra(Compras compra) {
        compras.add(compra);
    }

    public List<Compras> getCompras() {
        return compras;
    }

    public void exibirHistorico() {
        if (compras.isEmpty()) {
            System.out.println("Nenhuma compra registrada.");
        } else {
            System.out.println("Histórico de compras:");
            for (Compras compra : compras) {
                System.out.println(compra);
            }
        }
    }
}
