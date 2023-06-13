package poo.economize.testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import poo.economize.Produtos;

public class ProdutosTest {

    @Test
    public void testGetNome() {
        Produtos produto = new Produtos("Arroz", "Aliança", 4.50, "Alimentos");

        Assertions.assertEquals("Arroz", produto.getNome());
    }

    @Test
    public void testGetMarca() {
        Produtos produto = new Produtos("Arroz", "Aliança", 4.50, "Alimentos");

        Assertions.assertEquals("Aliança", produto.getMarca());
    }

    @Test
    public void testGetValor() {
        Produtos produto = new Produtos("Arroz", "Aliança", 4.50, "Alimentos");

        Assertions.assertEquals(4.50, produto.getValor());
    }

    @Test
    public void testGetCategoria() {
        Produtos produto = new Produtos("Arroz", "Aliança", 4.50, "Alimentos");

        Assertions.assertEquals("Alimentos", produto.getCategoria());
    }


}
