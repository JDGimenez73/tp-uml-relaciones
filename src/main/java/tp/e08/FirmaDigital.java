/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e08;

/**
 *
 * @author JDGim
 */
import java.time.LocalDateTime;

/**
 * Agregación: FirmaDigital → Usuario (referencia externa, puede cambiarse o quedar null)
 */
public class FirmaDigital {
    private String hash;
    private LocalDateTime fecha;
    private Usuario usuario; // agregación

    public FirmaDigital(String hash, LocalDateTime fecha, Usuario usuario) {
        this.hash = hash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getHash() { return hash; }
    public LocalDateTime getFecha() { return fecha; }
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; } // agregación: se puede cambiar

    @Override public String toString() {
        String u = usuario != null ? usuario.getNombre() : "—";
        return "FirmaDigital{hash='" + hash + "', fecha=" + fecha + ", usuario=" + u + "}";
    }
}

