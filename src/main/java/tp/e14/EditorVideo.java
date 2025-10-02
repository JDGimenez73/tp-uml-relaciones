/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e14;

/**
 *
 * @author JDGim
 */

/** Dependencia de creación: crea y retorna un Render, no almacena estado. */
public class EditorVideo {

    public Render exportar(String formato, Proyecto proyecto) {
        if (formato == null || formato.isBlank()) {
            throw new IllegalArgumentException("El formato es obligatorio");
        }
        if (proyecto == null) {
            throw new IllegalArgumentException("El proyecto es obligatorio");
        }
        return new Render(formato, proyecto);
    }
}

