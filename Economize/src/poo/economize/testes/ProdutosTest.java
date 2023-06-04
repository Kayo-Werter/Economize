package poo.economize.testes;

import org.junit.Test;
import poo.economize.Produtos;

import static org.junit.Assert.*;

public class ProdutosTest {

    @Test
    public void testGetNome() {
        Produtos produto = new Produtos("Arroz", "Tio João", 5.0, 10);
        String expected = "Arroz";
        String actual = produto.getNome();
        assertEquals(expected, actual);
    }
}
