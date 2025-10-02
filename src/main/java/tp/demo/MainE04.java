/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.demo;

/**
 *
 * @author JDGim
 */
import tp.e04.*;
import java.time.LocalDate;

public class MainE04 {
    public static void main(String[] args) {
        Banco b = new Banco("Banco Nación", "30-00000000-0");
        TarjetaDeCredito t = new TarjetaDeCredito("4111111111111111", LocalDate.of(2031, 6, 1), b);
        Cliente c = new Cliente("Luis", "30123456");

        t.setCliente(c);

        System.out.println(t + " de " + c);
        t.setBanco(null);
        System.out.println("Sin banco -> " + t);

        t.setBanco(new Banco("Banco Provincia", "30-99999999-9"));
        System.out.println("Nuevo banco -> " + t);
    }
}

