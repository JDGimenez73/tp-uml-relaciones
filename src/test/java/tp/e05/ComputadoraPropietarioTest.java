/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e05;

/**
 *
 * @author JDGim
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ComputadoraPropietarioTest {

    @Test
    void bidireccional_consistente() {
        PlacaMadre pm = new PlacaMadre("B550", "AMD");
        Computadora pc = new Computadora("Lenovo", "SN-1", pm);
        Propietario p = new Propietario("David", "30111222");

        pc.setPropietario(p);

        assertSame(p, pc.getPropietario(), "Propietario debe quedar en Computadora");
        assertSame(pc, p.getComputadora(), "Computadora debe quedar en Propietario");
    }

    @Test
    void composicion_placaMadre_es_obligatoria_y_constante() {
        assertThrows(IllegalArgumentException.class, () -> new Computadora("HP", "SN-2", null));
        PlacaMadre pm = new PlacaMadre("Z790", "Intel");
        Computadora pc = new Computadora("HP", "SN-2", pm);
        assertSame(pm, pc.getPlacaMadre());
    }
}
