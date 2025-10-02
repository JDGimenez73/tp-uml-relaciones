/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e08;

/**
 *
 * @author JDGim
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

public class DocumentoFirmaUsuarioTest {

    @Test
    void composicion_documento_requiere_firma() {
        assertThrows(IllegalArgumentException.class,
            () -> new Documento("Contrato", "Contenido", null));

        Usuario u = new Usuario("Carla", "carla@example.com");
        FirmaDigital f = new FirmaDigital("abc123", LocalDateTime.of(2025, 9, 1, 10, 0), u);
        Documento d = new Documento("Contrato", "Contenido", f);

        assertSame(f, d.getFirma());
    }

    @Test
    void agregacion_firma_puede_cambiar_usuario() {
        Usuario u1 = new Usuario("Carla", "carla@example.com");
        FirmaDigital f = new FirmaDigital("h1", LocalDateTime.of(2025, 9, 1, 10, 0), u1);
        Documento d = new Documento("Doc", "Texto", f);

        assertEquals("Carla", d.getFirma().getUsuario().getNombre());

        // cambiar usuario (agregación)
        Usuario u2 = new Usuario("Pablo", "pablo@example.com");
        d.getFirma().setUsuario(u2);
        assertEquals("Pablo", d.getFirma().getUsuario().getNombre());

        // también podría quedar sin usuario
        d.getFirma().setUsuario(null);
        assertNull(d.getFirma().getUsuario());
    }
}
