/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosprogramacion5;

import java.util.Scanner;


/**
 * 5. Bucles
 * 
 * 11. Escribe un programa que muestre en tres columnas, el cuadrado y
 *     el cubo de los 5 primeros nÃºmeros enteros a partir de uno que se
 *     introduce por teclado.
 * 
 * @author PocyxDesigner
 */

public class Ejer11Tema5 {
     

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un nÃºmero: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());

    for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
      System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
    }
  }
}
