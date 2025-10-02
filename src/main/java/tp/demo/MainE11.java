/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.demo;

/**
 *
 * @author JDGim
 */
import tp.e11.*;

public class MainE11 {
    public static void main(String[] args) {
        Artista ar = new Artista("Gustavo Cerati", "Rock");
        Cancion c = new Cancion("Crimen", ar);
        new Reproductor().reproducir(c);

        new Reproductor().reproducir(null); // caso seguro
    }
}
