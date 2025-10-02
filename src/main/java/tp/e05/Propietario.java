/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e05;

/**
 *
 * @author JDGim
 */
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; // vínculo bidireccional

    public Propietario(String nombre, String dni) {
        this.nombre = nombre; this.dni = dni;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        // No llamamos de vuelta a setPropietario para evitar recursión.
        // La otra parte es quien sincroniza la relación.
    }

    public Computadora getComputadora() { return computadora; }

    @Override public String toString() {
        return "Propietario{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}
