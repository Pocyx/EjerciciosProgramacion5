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
 * 15. Escribe un programa que dados dos nÃºmeros, uno real (base) y un
 *     entero positivo (exponente), saque por pantalla todas las potencias
 *     con base el numero dado y exponentes entre uno y el exponente introducido.
 *     No se deben utilizar funciones de exponenciaciÃ³n. Por ejemplo, si
 *     introducimos el 2 y el 5, se deberÃ¡n mostrar 2Â¹, 2Â², 2Â³, 2â´ y 2âµ.
 * 
 * @author PocyxDesigner
 */

public class Ejer15Tema5 {

  public static void main(String[] args) {
     
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un nÃºmero real como base: ");
    double base = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduzca un mÃºmero entero como exponente: ");
    int exponenteFinal = Integer.parseInt(s.nextLine());

    double potencia;
    int exponente;
        
    for (int i = 1; i <= exponenteFinal; i++) {
        
      potencia = 1;
      exponente = i;
      
      for (int j = 0; j < exponente; j++) {
        potencia *= base;
      }
      
      System.out.println(base + "^" + i + " = " + potencia);
    }

  }
}
