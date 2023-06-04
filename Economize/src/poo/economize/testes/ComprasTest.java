package poo.economize.testes;

import org.junit.Test;
import poo.economize.Compras;

import static org.junit.Assert.*;

public class ComprasTest {

    @Test
    public void testCalcularValorTotal() {
        Compras compra = new Compras("Arroz", 2, 5.0);
        double expected = 10.0;
        double actual = compra.calcularValorTotal();
        assertEquals(expected, actual, 0.0);
    }
}
