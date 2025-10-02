/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e11;

/**
 *
 * @author JDGim
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ReproductorTest {

    @Test
    void reproducir_imprime_linea_esperada() {
        Artista a = new Artista("Soda Stereo", "Rock");
        Cancion c = new Cancion("De Música Ligera", a);
        Reproductor r = new Reproductor();

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        PrintStream old = System.out;
        System.setOut(new PrintStream(bos));
        try {
            r.reproducir(c);
        } finally {
            System.setOut(old);
        }
        String out = bos.toString();
        assertTrue(out.contains("Reproduciendo: De Música Ligera"));
        assertTrue(out.contains("Soda Stereo"));
    }

    @Test
    void reproducir_null_seguro() {
        Reproductor r = new Reproductor();

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        PrintStream old = System.out;
        System.setOut(new PrintStream(bos));
        try {
            r.reproducir(null);
        } finally {
            System.setOut(old);
        }
        assertTrue(bos.toString().contains("Nada para reproducir"));
    }
}
