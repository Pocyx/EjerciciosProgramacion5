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
 * 9. Realiza un programa que nos diga cuÃ¡ntos dÃ­gitos tiene un nÃºmero introducido por teclado.
 * 
 * @author PocyxDesigner
 */

public class Ejer09Tema5 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int numeroDeDigitos = 1, n, numeroIntroducido;

    System.out.print("Introduzca un nÃºmero entero y le dirÃ© cuÃ¡ntos dÃ­gitos tiene: ");
    numeroIntroducido = Integer.parseInt(s.nextLine());
    
    n = numeroIntroducido;
    
    while (n >= 10) {
      n /= 10;
      numeroDeDigitos++;
    }
    
    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dÃ­gito/s.");

  }
}
