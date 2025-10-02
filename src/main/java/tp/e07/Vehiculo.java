/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e07;

/**
 *
 * @author JDGim
 */

/**
 * Agregación: Vehiculo → Motor
 * Bidireccional: Vehiculo ↔ Conductor
 */
public class Vehiculo {
    private String patente;
    private String modelo;

    // Agregación: se puede cambiar o quitar
    private Motor motor;

    // Bidireccional con Conductor
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getPatente() { return patente; }
    public String getModelo() { return modelo; }

    public Motor getMotor() { return motor; }
    public void setMotor(Motor motor) { this.motor = motor; } // agregación

    public Conductor getConductor() { return conductor; }
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }

    @Override public String toString() {
        return "Vehiculo{patente='" + patente + "', modelo='" + modelo + "', motor=" + motor + "}";
    }
}
