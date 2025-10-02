/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JDGim
 */
package tp.e01;

public class Foto {
    private byte[] imagen;
    private String formato;

    public Foto(byte[] imagen, String formato) {
        this.imagen = imagen; this.formato = formato;
    }
    public byte[] getImagen() { return imagen; }
    public String getFormato() { return formato; }

    @Override public String toString() {
        return "Foto{formato='" + formato + "', bytes=" + (imagen==null?0:imagen.length) + "}";
    }
}

