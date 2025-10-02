/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.e11;

/**
 *
 * @author JDGim
 */

/**
 * Dependencia de uso: usa 'Cancion' como parámetro, no la almacena como atributo.
 */
public class Reproductor {

    public void reproducir(Cancion cancion) {
        if (cancion == null) {
            System.out.println("> Nada para reproducir.");
            return;
        }
        String artista = cancion.getArtista() != null ? cancion.getArtista().getNombre() : "Artista desconocido";
        System.out.println("> Reproduciendo: " + cancion.getTitulo() + " - " + artista);
    }
}
