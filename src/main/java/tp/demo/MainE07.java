/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.demo;

/**
 *
 * @author JDGim
 */
import tp.e07.*;

public class MainE07 {
    public static void main(String[] args) {
        Motor m = new Motor("Nafta", "M-999");
        Vehiculo v = new Vehiculo("AA123BB", "Sedan", m);
        Conductor c = new Conductor("Lucho", "B123456");

        v.setConductor(c);
        System.out.println(v + " conducido por " + c);

        v.setMotor(null);
        System.out.println("Sin motor -> " + v);

        v.setMotor(new Motor("Eléctrico", "E-777"));
        System.out.println("Motor nuevo -> " + v);
    }
}
