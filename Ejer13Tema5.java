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
 * 13. Escribe un programa que lea una lista de diez nÃºmeros y determine
 *     cuÃ¡ntos son positivos, y cuÃ¡ntos son negativos.
 * 
 * @author PocyxDesigner
 */

public class Ejer13Tema5 {

  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    System.out.println("Por favor, introduzca 10 nÃºmeros enteros: ");

    int negativos = 0;
    int positivos = 0;
    
    for (int i = 0; i < 10; i++) {
      if (Integer.parseInt(s.nextLine()) < 0) {
        negativos++;
      } else {
        positivos++;
      }
    }
    
    System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " negativos");

  }
}
