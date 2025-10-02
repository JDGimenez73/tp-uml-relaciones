/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e07;

/**
 *
 * @author JDGim
 */
public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; // vínculo bidireccional

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre; this.licencia = licencia;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo; // no re-llamamos para evitar recursión
    }

    public Vehiculo getVehiculo() { return vehiculo; }

    @Override public String toString() {
        return "Conductor{nombre='" + nombre + "', licencia='" + licencia + "'}";
    }
}

