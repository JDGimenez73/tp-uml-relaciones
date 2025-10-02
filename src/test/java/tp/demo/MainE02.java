/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.demo;

/**
 *
 * @author JDGim
 */
import tp.e02.*;

public class MainE02 {
    public static void main(String[] args) {
        Celular c = new Celular("356789012345678", "Samsung", "A34");
        c.setBateria(new Bateria("BAT-5000", 5000));
        Usuario u = new Usuario("Juan", "22123456");
        c.setUsuario(u);
        System.out.println(c + " con " + c.getBateria() + " de " + u);
    }
}
