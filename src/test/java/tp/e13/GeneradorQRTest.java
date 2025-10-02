/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e13;

/**
 *
 * @author JDGim
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GeneradorQRTest {

    @Test
    void generar_devuelve_qr_valido() {
        GeneradorQR g = new GeneradorQR();
        Usuario u = new Usuario("Mati", "m@x.com");

        CodigoQR qr = g.generar("VAL-1", u);

        assertNotNull(qr);
        assertEquals("VAL-1", qr.getValor());
        assertEquals("Mati", qr.getUsuario().getNombre());
    }

    @Test
    void generar_con_valor_invalido_lanza_excepcion() {
        GeneradorQR g = new GeneradorQR();
        assertThrows(IllegalArgumentException.class, () -> g.generar("", null));
        assertThrows(IllegalArgumentException.class, () -> g.generar("   ", null));
        assertThrows(IllegalArgumentException.class, () -> g.generar(null, null));
    }
}
