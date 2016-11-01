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
 * 16. Escribe un programa que diga si un nÃºmero introducido por teclado
 *     es o no primo. Un nÃºmero primo es aquel que sÃ³lo es divisible entre
 *     Ã©l mismo y la unidad.
 * 
 * @author PocyxDesigner
 */

public class Ejer16Tema5 {

  public static void main(String[] args) {
     
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un nÃºmero entero y le dirÃ© si es primo: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());

    boolean esPrimo = true;
    
    for (int i = 2; i < numeroIntroducido; i++) {
      if ((numeroIntroducido % i) == 0) {
        esPrimo = false;
      }
    }
        
    if (esPrimo) {
      System.out.println("El nÃºmero introducido es primo.");
    } else {
      System.out.println("El nÃºmero introducido no es primo.");
    }

  }
}
