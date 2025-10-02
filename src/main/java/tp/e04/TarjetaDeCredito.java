/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e04;

/**
 *
 * @author JDGim
 */

import java.time.LocalDate;

/**
 * TarjetaDeCredito ↔ Cliente : bidireccional
 * TarjetaDeCredito → Banco    : agregación (se puede cambiar/quitar Banco)
 */
public class TarjetaDeCredito {
    private String numero;
    private LocalDate fechaVencimiento;

    private Banco banco;          // agregación
    private Cliente cliente;      // bidireccional

    public TarjetaDeCredito(String numero, LocalDate fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }

    public Cliente getCliente() { return cliente; }
    public Banco getBanco() { return banco; }
    public void setBanco(Banco banco) { this.banco = banco; }

    public String getNumero() { return numero; }
    public LocalDate getFechaVencimiento() { return fechaVencimiento; }

    @Override public String toString() {
        String bancoNom = (banco != null ? banco.getNombre() : "—");
        return "Tarjeta{numero='" + numero + "', vence=" + fechaVencimiento + ", banco=" + bancoNom + "}";
    }
}

