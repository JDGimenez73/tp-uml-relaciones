/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e13;

/**
 *
 * @author JDGim
 */

/** Dependencia de creación: crea y retorna un CodigoQR, no almacena estado. */
public class GeneradorQR {

    public CodigoQR generar(String valor, Usuario usuario) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("El valor del QR es obligatorio");
        }
        return new CodigoQR(valor, usuario);
    }
}

