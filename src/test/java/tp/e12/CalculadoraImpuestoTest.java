/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e12;

/**
 *
 * @author JDGim
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CalculadoraImpuestoTest {

    @Test
    void calcular_devuelve_total_y_escribe_salida() {
        Contribuyente c = new Contribuyente("Laura", "27-12345678-9");
        Impuesto imp = new Impuesto(1000.0, c);
        Calculadora calc = new Calculadora();

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        PrintStream old = System.out;
        System.setOut(new PrintStream(bos));
        double total;
        try {
            total = calc.calcular(imp);
        } finally {
            System.setOut(old);
        }

        assertEquals(1210.0, total, 0.0001, "Debería aplicar 21% sobre 1000");
        String out = bos.toString();
        assertTrue(out.contains("Calculando impuesto para Laura"));
        assertTrue(out.contains("base $1000.0"));
        assertTrue(out.contains("total $1210.0"));
    }

    @Test
    void calcular_null_es_seguro_y_retorna_cero() {
        Calculadora calc = new Calculadora();

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        PrintStream old = System.out;
        System.setOut(new PrintStream(bos));
        double total;
        try {
            total = calc.calcular(null);
        } finally {
            System.setOut(old);
        }

        assertEquals(0.0, total, 0.0001);
        assertTrue(bos.toString().contains("No hay impuesto para calcular."));
    }
}
