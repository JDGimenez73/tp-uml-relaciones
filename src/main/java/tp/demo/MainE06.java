/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.demo;

/**
 *
 * @author JDGim
 */
import tp.e06.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class MainE06 {
    public static void main(String[] args) {
        Cliente c = new Cliente("María", "11-5555-5555");
        Mesa m = new Mesa(12, 4);
        Reserva r = new Reserva(LocalDate.of(2025, 10, 1), LocalTime.of(20, 30), c, m);

        System.out.println(r);
        r.setMesa(null);
        System.out.println("Reasignando -> " + r);
        r.setMesa(new Mesa(7, 2));
        System.out.println("Nueva mesa -> " + r);
    }
}
