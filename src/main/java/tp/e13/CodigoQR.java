/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e13;

/**
 *
 * @author JDGim
 */

/** Asociación unidireccional: CodigoQR -> Usuario */
public class CodigoQR {
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor; this.usuario = usuario;
    }

    public String getValor()  { return valor; }
    public Usuario getUsuario() { return usuario; }

    @Override public String toString() {
        String nom = usuario != null ? usuario.getNombre() : "—";
        return "CodigoQR{valor='" + valor + "', usuario=" + nom + "}";
    }
}
