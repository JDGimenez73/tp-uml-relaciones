/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e12;

/**
 *
 * @author JDGim
 */
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente; // unidireccional

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto; this.contribuyente = contribuyente;
    }

    public double getMonto() { return monto; }
    public Contribuyente getContribuyente() { return contribuyente; }

    @Override public String toString() {
        String n = contribuyente != null ? contribuyente.getNombre() : "—";
        return "Impuesto{monto=" + monto + ", contribuyente=" + n + "}";
    }
}
