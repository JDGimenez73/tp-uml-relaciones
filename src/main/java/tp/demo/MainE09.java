/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.demo;

/**
 *
 * @author JDGim
 */
import tp.e09.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class MainE09 {
    public static void main(String[] args) {
        Paciente p = new Paciente("Lucía", "OSDE");
        Profesional pr = new Profesional("Dra. Pérez", "Clínica");
        CitaMedica c = new CitaMedica(LocalDate.of(2025, 10, 2), LocalTime.of(9, 15), p, pr);

        System.out.println(c);
        c.setPaciente(new Paciente("Martín", "Swiss Medical"));
        c.setProfesional(new Profesional("Dr. Gómez", "Cardiología"));
        c.setFecha(LocalDate.of(2025, 10, 3));
        c.setHora(LocalTime.of(11, 30));
        System.out.println("Reprogramada -> " + c);
    }
}
