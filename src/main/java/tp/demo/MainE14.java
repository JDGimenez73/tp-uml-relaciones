/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.demo;

/**
 *
 * @author JDGim
 */
import tp.e14.*;

public class MainE14 {
    public static void main(String[] args) {
        EditorVideo ev = new EditorVideo();
        Proyecto pr = new Proyecto("Trailer", 2);
        Render r = ev.exportar("mp4", pr);
        System.out.println("Render listo -> " + r);
    }
}

