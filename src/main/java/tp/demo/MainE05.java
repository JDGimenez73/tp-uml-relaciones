/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.demo;

/**
 *
 * @author JDGim
 */
import tp.e05.*;

public class MainE05 {
    public static void main(String[] args) {
        PlacaMadre pm = new PlacaMadre("B550", "AMD");
        Computadora pc = new Computadora("Lenovo", "SN-1", pm);
        Propietario p = new Propietario("David", "30111222");

        pc.setPropietario(p);

        System.out.println(pc + " de " + p);
        System.out.println("Propietario->PC: " + p.getComputadora());
    }
}

