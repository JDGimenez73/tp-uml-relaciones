/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e07;

/**
 *
 * @author JDGim
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VehiculoConductorTest {

    @Test
    void bidireccional_consistente() {
        Motor m = new Motor("Nafta", "M-999");
        Vehiculo v = new Vehiculo("AA123BB", "Sedan", m);
        Conductor c = new Conductor("Lucho", "B123456");

        v.setConductor(c);

        assertSame(c, v.getConductor(), "Conductor debe quedar en Vehiculo");
        assertSame(v, c.getVehiculo(), "Vehiculo debe quedar en Conductor");
    }

    @Test
    void agregacion_motor_se_puede_cambiar_o_quitar() {
        Motor m1 = new Motor("Nafta", "S-100");
        Vehiculo v = new Vehiculo("AB456CD", "SUV", m1);

        assertEquals("S-100", v.getMotor().getNumeroSerie());

        v.setMotor(null); // quitar
        assertNull(v.getMotor());

        Motor m2 = new Motor("Híbrido", "S-200");
        v.setMotor(m2);   // reemplazar
        assertEquals("S-200", v.getMotor().getNumeroSerie());
    }
}
