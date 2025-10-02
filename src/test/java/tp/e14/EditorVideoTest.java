/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e14;

/**
 *
 * @author JDGim
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EditorVideoTest {

    @Test
    void exportar_devuelve_render_valido() {
        EditorVideo ev = new EditorVideo();
        Proyecto p = new Proyecto("Corto", 5);

        Render r = ev.exportar("mp4", p);

        assertNotNull(r);
        assertEquals("mp4", r.getFormato());
        assertEquals("Corto", r.getProyecto().getNombre());
    }

    @Test
    void exportar_con_parametros_invalidos_lanza_excepcion() {
        EditorVideo ev = new EditorVideo();
        Proyecto p = new Proyecto("Demo", 2);

        assertThrows(IllegalArgumentException.class, () -> ev.exportar("", p));
        assertThrows(IllegalArgumentException.class, () -> ev.exportar("   ", p));
        assertThrows(IllegalArgumentException.class, () -> ev.exportar(null, p));
        assertThrows(IllegalArgumentException.class, () -> ev.exportar("mp4", null));
    }
}
