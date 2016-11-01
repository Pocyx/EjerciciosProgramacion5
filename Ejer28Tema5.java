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
 * 28. Escribe  un  programa que calcule el factorial de un  nÃºmero
 *     entero leÃ­do por teclado.
 * 
 * @author PocyxDesigner
 */
public class Ejer28Tema5 {

  public static void main(String[] args) {
      
    Scanner s = new Scanner(System.in);
    
    int numeroIntroducido;
    
    // Lee un nÃºmero mayor o igual que 0
    do {
      System.out.print("Introduzca un nÃºmero entero mayor o igual que 0: ");
      numeroIntroducido = Integer.parseInt(s.nextLine());
      
      if (numeroIntroducido < 0) {
        System.out.println("El nÃºmero introducido no es correcto.");
      }
    } while (numeroIntroducido < 0);

    int factorial = numeroIntroducido;
    
    if (numeroIntroducido == 0) {
      System.out.println("El factorial del " + numeroIntroducido + " es 1.");
    } else {
      for (int i = 1; i < numeroIntroducido; i++) {
        factorial *= i;
      }

      System.out.println("El factorial del " + numeroIntroducido + " es " + factorial);
    }
  }
}
