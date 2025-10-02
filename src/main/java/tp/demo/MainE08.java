/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.demo;

/**
 * 
 *
 * @author JDGim
 */
import tp.e08.*;
import java.time.LocalDateTime;

public class MainE08 {
    public static void main(String[] args) {
        Usuario u = new Usuario("Carla", "carla@ejemplo.com");
        FirmaDigital f = new FirmaDigital("abc123", LocalDateTime.now(), u);
        Documento d = new Documento("Acta", "Se deja constancia...", f);

        System.out.println(d);

        // Cambiamos el usuario firmante (agregación)
        d.getFirma().setUsuario(new Usuario("Pablo", "pablo@ejemplo.com"));
        System.out.println("Firma actualizada -> " + d);
    }
}

