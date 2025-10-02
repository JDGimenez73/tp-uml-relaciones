/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e09;

/**
 *
 * @author JDGim
 */
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Unidireccional: CitaMedica -> Paciente
 * Unidireccional: CitaMedica -> Profesional
 */
public class CitaMedica {
    private LocalDate fecha;
    private LocalTime hora;
    private Paciente paciente;         // unidireccional
    private Profesional profesional;   // unidireccional

    public CitaMedica(LocalDate fecha, LocalTime hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    public LocalDate getFecha() { return fecha; }
    public LocalTime getHora() { return hora; }
    public Paciente getPaciente() { return paciente; }
    public Profesional getProfesional() { return profesional; }

    // Permitimos reprogramar o reasignar referencias (sigue siendo unidireccional)
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }
    public void setProfesional(Profesional profesional) { this.profesional = profesional; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public void setHora(LocalTime hora) { this.hora = hora; }

    @Override public String toString() {
        String p = paciente != null ? paciente.getNombre() : "—";
        String pr = profesional != null ? profesional.getNombre() : "—";
        return "CitaMedica{" + fecha + " " + hora + ", paciente=" + p + ", profesional=" + pr + "}";
    }
}
