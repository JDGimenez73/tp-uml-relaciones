/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e03;

/**
 *
 * @author JDGim
 */

public class Libro {
    private String titulo;
    private String isbn;

    private Autor autor;           // unidireccional
    private Editorial editorial;   // agregación

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    // Getters
    public String getTitulo() { return titulo; }
    public String getIsbn() { return isbn; }
    public Autor getAutor() { return autor; }
    public Editorial getEditorial() { return editorial; }

    // Agregación: permitir reemplazar o quitar
    public void setEditorial(Editorial editorial) { this.editorial = editorial; }

    @Override public String toString() {
        String autorNombre = (autor != null ? autor.getNombre() : "—");
        String editorialNom = (editorial != null ? editorial.getNombre() : "—");
        return "Libro{titulo='" + titulo + "', isbn='" + isbn +
               "', autor=" + autorNombre + ", editorial=" + editorialNom + "}";
    }
}
