/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e04;

/**
 *
 * @author JDGim
 */
public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; // vínculo bidireccional

    public Cliente(String nombre, String dni) {
        this.nombre = nombre; this.dni = dni;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
        if (tarjeta != null && tarjeta.getCliente() != this) {
            tarjeta.setCliente(this);
        }
    }

    public TarjetaDeCredito getTarjeta() { return tarjeta; }

    @Override public String toString() {
        return "Cliente{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}

