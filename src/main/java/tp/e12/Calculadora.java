/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e12;

/**
 *
 * @author JDGim
 */

/**
 * Dependencia de uso: usa 'Impuesto' como parámetro, no lo almacena como atributo.
 */
public class Calculadora {

    public double calcular(Impuesto impuesto) {
        if (impuesto == null) {
            System.out.println("No hay impuesto para calcular.");
            return 0.0;
        }
        // Ejemplo simple: aplica una alícuota ficticia del 21% sobre el monto base.
        double total = impuesto.getMonto() * 1.21;
        String nombre = impuesto.getContribuyente() != null ? impuesto.getContribuyente().getNombre() : "Desconocido";
        System.out.println("Calculando impuesto para " + nombre + ": base $" + impuesto.getMonto() + " -> total $" + total);
        return total;
    }
}
