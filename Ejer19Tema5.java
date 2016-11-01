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
 * 19. Realiza un programa que pinte una pirÃ¡mide por pantalla. La altura
 *     se debe pedir por teclado. El carÃ¡cter con el que se pinta la pirÃ¡mide
 *     tambiÃ©n se debe pedir por teclado.
 * 
 * @author PocyxDesigner
 */
public class Ejer19Tema5 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca la altura de la pirÃ¡mide: ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());

    System.out.print("Introduzca el carÃ¡cter de relleno: ");
    String relleno = s.nextLine();
    
    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida-1;
    
    while (altura <= alturaIntroducida) {
      
      // inserta espacios
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      // pinta la lÃ­nea
      for (i = 1; i < altura * 2; i++) {
        System.out.print(relleno);
      }

      System.out.println();

      altura++;
      espacios--;
    }
  }
}
