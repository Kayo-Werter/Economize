package poo.economize;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class HistoricoDeCompras {
    private List<Compra> compras;

    public HistoricoDeCompras() {
        compras = new ArrayList<>();
    }

    public void adicionarCompra(Compra compra) {
        compras.add(compra);
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void exibirHistorico() {
        if (compras.isEmpty()) {
            System.out.println("Nenhuma compra registrada.");
        } else {
            System.out.println("Histórico de compras:");
            for (Compra compra : compras) {
                System.out.println(compra);
            }
        }
    }
