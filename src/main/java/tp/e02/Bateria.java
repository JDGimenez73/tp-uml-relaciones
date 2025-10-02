/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e02;

/**
 *
 * @author JDGim
 */
public class Bateria {
    private String modelo;
    private int capacidadMah;

    public Bateria(String modelo, int capacidadMah) {
        this.modelo = modelo; this.capacidadMah = capacidadMah;
    }

    public String getModelo() { return modelo; }
    public int getCapacidadMah() { return capacidadMah; }

    @Override public String toString() {
        return "Bateria{modelo='" + modelo + "', capacidadMah=" + capacidadMah + "}";
    }
}
