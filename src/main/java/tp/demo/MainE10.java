/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.demo;

/**
 *
 * @author JDGim
 */
import tp.e10.*;
import java.time.LocalDate;

public class MainE10 {
    public static void main(String[] args) {
        ClaveSeguridad cl = new ClaveSeguridad("xYz9", LocalDate.now());
        CuentaBancaria cb = new CuentaBancaria("1111222233334444555566", 1500.0, cl);
        Titular ti = new Titular("Sofía", "33999888");
        cb.setTitular(ti);

        System.out.println(cb + " de " + ti);
        cb.setSaldo(2500.0);
        System.out.println("Nuevo saldo -> " + cb.getSaldo());
    }
}

