/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e02;

/**
 *
 * @author JDGim
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;

    // Agregación: Celular → Bateria (pueden existir por separado)
    private Bateria bateria;

    // Asociación bidireccional con Usuario
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo) {
        this.imei = imei; this.marca = marca; this.modelo = modelo;
    }

    public void setBateria(Bateria bateria) { this.bateria = bateria; }
    public Bateria getBateria() { return bateria; }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }
    public Usuario getUsuario() { return usuario; }

    @Override public String toString() {
        return "Celular{imei='" + imei + "', marca='" + marca + "', modelo='" + modelo + "'}";
    }
}

