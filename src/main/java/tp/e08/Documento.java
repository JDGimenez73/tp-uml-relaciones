/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e08;

/**
 *
 * @author JDGim
 */

/**
 * Composición: Documento → FirmaDigital (obligatoria, sin setter público)
 */
public class Documento {
    private String titulo;
    private String contenido;
    private final FirmaDigital firma; // composición

    public Documento(String titulo, String contenido, FirmaDigital firma) {
        if (firma == null) throw new IllegalArgumentException("La firma es obligatoria");
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = firma;
    }

    public String getTitulo() { return titulo; }
    public String getContenido() { return contenido; }
    public FirmaDigital getFirma() { return firma; }

    @Override public String toString() {
        return "Documento{titulo='" + titulo + "', firma=" + firma + "}";
    }
}
