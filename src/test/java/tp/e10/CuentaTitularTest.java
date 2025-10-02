/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e10;

/**
 *
 * @author JDGim
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class CuentaTitularTest {

    @Test
    void composicion_clave_es_obligatoria() {
        assertThrows(IllegalArgumentException.class,
            () -> new CuentaBancaria("0000000000000000000000", 0.0, null));

        ClaveSeguridad cl = new ClaveSeguridad("abcd", LocalDate.of(2025, 9, 1));
        CuentaBancaria cb = new CuentaBancaria("0000000000000000000000", 1000.0, cl);
        assertSame(cl, cb.getClave());
    }

    @Test
    void bidireccional_consistente() {
        ClaveSeguridad cl = new ClaveSeguridad("abcd", LocalDate.now());
        CuentaBancaria cb = new CuentaBancaria("1111222233334444555566", 500.0, cl);
        Titular t = new Titular("Sofía", "33999888");

        cb.setTitular(t);

        assertSame(t, cb.getTitular(), "Titular debe quedar en la Cuenta");
        assertSame(cb, t.getCuenta(), "Cuenta debe quedar en el Titular");
    }
}
