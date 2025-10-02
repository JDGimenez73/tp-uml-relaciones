/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.demo;

/**
 *
 * @author JDGim
 */
import tp.e13.*;

public class MainE13 {
    public static void main(String[] args) {
        GeneradorQR gen = new GeneradorQR();
        Usuario u = new Usuario("Mati", "m@x.com");
        CodigoQR qr = gen.generar("ABC-123", u);
        System.out.println("QR generado -> " + qr);
    }
}

