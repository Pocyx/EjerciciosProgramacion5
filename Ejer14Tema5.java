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
 * 14. Escribe un programa que pida una base y un exponente (entero positivo)
 *     y que calcule la potencia.
 * 
 * @author PocyxDesigner
 */

public class Ejer14Tema5 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.println("CÃ¡lculo de una potencia");
    
    System.out.print("Introduzca la base: ");
    int base = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduzca el exponente: ");
    int exponente = Integer.parseInt(s.nextLine());

    double potencia = 1;
        
    if (exponente == 0) {
      potencia = 1;
    }
    
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia *= base;
      }
    }
    
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        potencia *= base;
      }
      
      potencia = 1/potencia;
    }

    System.out.println(base + "^" + exponente + " = " + potencia);
  }
}
