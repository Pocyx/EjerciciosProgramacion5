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
 * 24. Escribe un programa que lea un nÃºmero N e imprima una pirÃ¡mide de nÃºmeros con N filas como
 *     en la siguiente figura: 
 *          1 
 *         121
 *        12321 
 *       1234321
 * 
 * @author PocyxDesigner
 */
public class Ejer24Tema5 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa pinta una pirÃ¡mide hecha a base de nÃºmeros.");
    System.out.print("Por favor, introduzca la altura de la pirÃ¡mide:");
    int alturaIntroducida = Integer.parseInt(s.nextLine());

    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida - 1;
    
    while (altura <= alturaIntroducida) {
      
      // inserta espacios
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      // pinta la lÃ­nea de nÃºmeros
      for (i = 1; i < altura; i++) {
        System.out.print(i);
      }
      
      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      
      altura++;
      espacios--;
    } // while
  }
}
