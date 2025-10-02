/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e01;

/**
 *
 * @author JDGim
 */

import java.time.LocalDate;

public class Pasaporte {
    private String numero;
    private LocalDate fechaEmision;
    // Composición: Pasaporte posee Foto
    private Foto foto;
    // Asociación bidireccional con Titular
    private Titular titular;

    public Pasaporte(String numero, LocalDate fechaEmision, Foto foto) {
        this.numero = numero; this.fechaEmision = fechaEmision; this.foto = foto;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public Titular getTitular() { return titular; }
    public String getNumero() { return numero; }
    public LocalDate getFechaEmision() { return fechaEmision; }
    public Foto getFoto() { return foto; }

    @Override public String toString() {
        return "Pasaporte{numero='" + numero + "', fechaEmision=" + fechaEmision + "}";
    }
}
