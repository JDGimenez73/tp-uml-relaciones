/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e09;

/**
 *
 * @author JDGim
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalTime;

public class CitaMedicaTest {

    @Test
    void unidireccional_desde_cita_hacia_paciente_y_profesional() {
        Paciente pac = new Paciente("Lucía", "OSDE");
        Profesional pro = new Profesional("Dra. Pérez", "Clínica");
        CitaMedica c = new CitaMedica(LocalDate.of(2025, 10, 2), LocalTime.of(9, 15), pac, pro);

        assertEquals("Lucía", c.getPaciente().getNombre());
        assertEquals("Dra. Pérez", c.getProfesional().getNombre());
    }

    @Test
    void reprogramar_cita_y_reasignar_referencias() {
        CitaMedica c = new CitaMedica(
            LocalDate.of(2025, 10, 2), LocalTime.of(9, 15),
            new Paciente("Lucía", "OSDE"),
            new Profesional("Dra. Pérez", "Clínica")
        );

        // Reprogramar fecha/hora
        c.setFecha(LocalDate.of(2025, 10, 3));
        c.setHora(LocalTime.of(11, 30));
        assertEquals(LocalDate.of(2025, 10, 3), c.getFecha());
        assertEquals(LocalTime.of(11, 30), c.getHora());

        // Reasignar paciente/profesional (sigue unidireccional)
        c.setPaciente(new Paciente("Martín", "Swiss Medical"));
        c.setProfesional(new Profesional("Dr. Gómez", "Cardiología"));
        assertEquals("Martín", c.getPaciente().getNombre());
        assertEquals("Dr. Gómez", c.getProfesional().getNombre());
    }
}

