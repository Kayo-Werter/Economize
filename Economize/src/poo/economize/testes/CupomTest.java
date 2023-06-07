package poo.economize.testes;

import org.junit.Test;
import poo.economize.Cupom;

import static org.junit.Assert.*;
import java.util.Date;

public class CupomTest {

    @Test
    public void testGetCodigo() {
        Cupom cupom = new Cupom("DESC10", new Date(), 10.0);
        String expected = "DESC10";
        String actual = cupom.getCodigo();
        assertEquals(expected, actual);
    }
}