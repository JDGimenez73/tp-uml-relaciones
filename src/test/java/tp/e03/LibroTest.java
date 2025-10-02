/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e03;

/**
 *
 * @author JDGim
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LibroTest {

    @Test
    void asociacion_unidireccional_y_agregacion() {
        Autor a = new Autor("Gabriel García Márquez", "Colombiana");
        Editorial e = new Editorial("Sudamericana", "Av. Siempre Viva 123");
        Libro l = new Libro("Cien años de soledad", "978-0-123-45678-9", a, e);

        // Asociación unidireccional: desde Libro se accede a Autor
        assertEquals("Gabriel García Márquez", l.getAutor().getNombre());

        // Agregación: se puede cambiar o quitar la Editorial
        assertEquals("Sudamericana", l.getEditorial().getNombre());
        l.setEditorial(null); // quitar
        assertNull(l.getEditorial());
        l.setEditorial(new Editorial("Alfaguara", "Calle Falsa 456")); // reemplazar
        assertEquals("Alfaguara", l.getEditorial().getNombre());
    }
}

