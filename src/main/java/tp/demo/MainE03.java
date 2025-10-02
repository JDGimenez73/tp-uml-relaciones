/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.demo;

/**
 *
 * @author JDGim
 */
import tp.e03.*;

public class MainE03 {
    public static void main(String[] args) {
        Autor a = new Autor("J. K. Rowling", "Británica");
        Editorial ed = new Editorial("Bloomsbury", "50 Bedford Sq, London");
        Libro l = new Libro("Harry Potter and the Philosopher's Stone",
                            "978-0-7475-3269-9", a, ed);

        System.out.println(l);
        l.setEditorial(null);
        System.out.println("Sin editorial -> " + l);
        l.setEditorial(new Editorial("Scholastic", "557 Broadway, NY"));
        System.out.println("Nueva editorial -> " + l);
    }
}
