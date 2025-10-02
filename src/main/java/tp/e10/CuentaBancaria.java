/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e10;

/**
 *
 * @author JDGim
 */

/**
 * Composición: CuentaBancaria → ClaveSeguridad (obligatoria, final, sin setter)
 * Bidireccional: CuentaBancaria ↔ Titular
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;

    private final ClaveSeguridad clave; // composición
    private Titular titular;            // bidireccional

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave) {
        if (clave == null) throw new IllegalArgumentException("La clave de seguridad es obligatoria");
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
    }

    public String getCbu() { return cbu; }
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public ClaveSeguridad getClave() { return clave; }

    public Titular getTitular() { return titular; }
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }

    @Override public String toString() {
        return "CuentaBancaria{cbu='" + cbu + "', saldo=" + saldo + ", clave=" + clave + "}";
    }
}
