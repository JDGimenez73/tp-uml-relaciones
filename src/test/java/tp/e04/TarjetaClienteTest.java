/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e04;

/**
 *
 * @author JDGim
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class TarjetaClienteTest {

    @Test
    void bidireccional_consistente() {
        Banco b = new Banco("Banco X", "30-12345678-9");
        TarjetaDeCredito tc = new TarjetaDeCredito("4509123412341234", LocalDate.of(2030,1,1), b);
        Cliente c = new Cliente("Ana", "22333444");

        tc.setCliente(c);

        assertSame(c, tc.getCliente(), "Cliente debe quedar seteado en Tarjeta");
        assertSame(tc, c.getTarjeta(), "Tarjeta debe quedar seteada en Cliente");
    }

    @Test
    void agregacion_banco_se_puede_cambiar_o_quitar() {
        Banco b1 = new Banco("Banco A", "30-11111111-1");
        TarjetaDeCredito tc = new TarjetaDeCredito("4000123412341234", LocalDate.of(2029,12,31), b1);

        assertEquals("Banco A", tc.getBanco().getNombre());

        tc.setBanco(null); // quitar
        assertNull(tc.getBanco());

        Banco b2 = new Banco("Banco B", "30-22222222-2");
        tc.setBanco(b2);   // reemplazar
        assertEquals("Banco B", tc.getBanco().getNombre());
    }
}

