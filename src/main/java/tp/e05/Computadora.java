/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e05;

/**
 *
 * @author JDGim
 */


/**
 * Composición: Computadora → PlacaMadre
 * Bidireccional: Computadora ↔ Propietario
 */
public class Computadora {
    private String marca;
    private String numeroSerie;

    // Composición: requerido y sin setter público (se configura al construir)
    private final PlacaMadre placaMadre;

    // Asociación bidireccional con Propietario
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre) {
        if (placaMadre == null) throw new IllegalArgumentException("La PlacaMadre es obligatoria");
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;
    }

    public PlacaMadre getPlacaMadre() { return placaMadre; }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    public Propietario getPropietario() { return propietario; }

    public String getMarca() { return marca; }
    public String getNumeroSerie() { return numeroSerie; }

    @Override public String toString() {
        return "Computadora{marca='" + marca + "', numeroSerie='" + numeroSerie + "', placa=" + placaMadre + "}";
    }
}
