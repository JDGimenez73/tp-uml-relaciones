/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e02;

/**
 *
 * @author JDGim
 */
public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; // asociación bidireccional

    public Usuario(String nombre, String dni) {
        this.nombre = nombre; this.dni = dni;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }

    public Celular getCelular() { return celular; }

    @Override public String toString() {
        return "Usuario{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}
