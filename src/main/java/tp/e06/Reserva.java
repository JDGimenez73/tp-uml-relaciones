/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e06;

/**
 *
 * @author JDGim
 */
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Reserva -> Cliente : asociación unidireccional
 * Reserva -> Mesa    : agregación (se puede cambiar o quitar)
 */
public class Reserva {
    private LocalDate fecha;
    private LocalTime hora;
    private Cliente cliente; // unidireccional
    private Mesa mesa;       // agregación

    public Reserva(LocalDate fecha, LocalTime hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public LocalDate getFecha() { return fecha; }
    public LocalTime getHora() { return hora; }
    public Cliente getCliente() { return cliente; }
    public Mesa getMesa() { return mesa; }

    // Agregación: permitir cambiar o quitar la mesa
    public void setMesa(Mesa mesa) { this.mesa = mesa; }

    @Override public String toString() {
        String mesaTxt = (mesa != null ? "Mesa " + mesa.getNumero() : "Sin mesa asignada");
        return "Reserva{" + fecha + " " + hora + ", " + mesaTxt + ", cliente=" +
               (cliente != null ? cliente.getNombre() : "—") + "}";
    }
}
