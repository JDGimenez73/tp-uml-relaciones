/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e01;

/**
 *
 * @author JDGim
 */


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class PasaporteTitularTest {

    @Test
    void bidireccional_consistente() {
        Foto foto = new Foto(new byte[5], "png");
        Pasaporte pas = new Pasaporte("Z123", LocalDate.of(2024,5,2), foto);
        Titular t = new Titular("Juan","11223344");

        pas.setTitular(t);

        assertSame(t, pas.getTitular(), "El titular del pasaporte debe ser 't'");
        assertSame(pas, t.getPasaporte(), "El pasaporte del titular debe ser 'pas'");
    }
}
