/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e06;

/**
 *
 * @author JDGim
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalTime;

public class ReservaTest {

    @Test
    void unidireccional_y_agregacion_ok() {
        Cliente c = new Cliente("María", "11-5555-5555");
        Mesa m = new Mesa(12, 4);
        Reserva r = new Reserva(LocalDate.of(2025, 10, 1), LocalTime.of(20, 30), c, m);

        // Unidireccional: desde Reserva -> Cliente
        assertEquals("María", r.getCliente().getNombre());

        // Agregación: cambiar o quitar mesa
        assertEquals(12, r.getMesa().getNumero());
        r.setMesa(null);
        assertNull(r.getMesa());
        r.setMesa(new Mesa(7, 2));
        assertEquals(7, r.getMesa().getNumero());
    }
}
