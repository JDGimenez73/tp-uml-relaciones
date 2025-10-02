/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e02;

/**
 *
 * @author JDGim
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CelularUsuarioTest {

    @Test
    void bidireccional_consistente() {
        Celular cel = new Celular("356789012345678", "Samsung", "A34");
        Usuario usr = new Usuario("Juan", "22123456");

        cel.setUsuario(usr);

        assertSame(usr, cel.getUsuario(), "El usuario del celular debe ser 'usr'");
        assertSame(cel, usr.getCelular(), "El celular del usuario debe ser 'cel'");
    }

    @Test
    void agregacion_bateria_se_puede_asignar_y_quitar() {
        Celular cel = new Celular("111222333444555", "Motorola", "G54");
        Bateria bat = new Bateria("BT-5000", 5000);

        cel.setBateria(bat);
        assertEquals("BT-5000", cel.getBateria().getModelo());

        cel.setBateria(null); // agregación: pueden vivir por separado
        assertNull(cel.getBateria());
    }
}
