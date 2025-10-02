/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.demo;

/**
 *
 * @author JDGim
 */

import tp.e01.*;
import java.time.LocalDate;

public class MainE01 {
  public static void main(String[] args) {
    Foto f = new Foto(new byte[10], "jpg");
    Pasaporte p = new Pasaporte("AA123", LocalDate.of(2024,1,10), f);
    Titular t = new Titular("Ana", "12345678");
    p.setTitular(t);
    System.out.println(p + " de " + t);
  }
}
