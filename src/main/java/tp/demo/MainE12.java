/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.demo;

/**
 *
 * @author JDGim
 */
import tp.e12.*;

public class MainE12 {
    public static void main(String[] args) {
        Contribuyente c = new Contribuyente("Laura", "27-12345678-9");
        Impuesto imp = new Impuesto(1000.0, c);
        Calculadora calc = new Calculadora();
        double total = calc.calcular(imp);
        System.out.println("-> Total a pagar: $" + total);
    }
}
