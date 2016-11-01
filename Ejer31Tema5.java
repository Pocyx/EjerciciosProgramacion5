/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosprogramacion5;

import java.util.Scanner;

/**
 *
 * @author PocyxDesigner
 */
public class Ejer31Tema5 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca la altura de la L: ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());

    System.out.print("Introduzca el caracter de relleno: ");
    String relleno = s.nextLine();
    
    int altura = 1;
    int i = 0;
     
    while (altura <= alturaIntroducida) {
      
      // pinta la linea
      for (i = 1; i < 2 ; i++) {
        System.out.print(relleno);

      }
      int horizontal = alturaIntroducida/2;
      // pinta la horizontal
      if (altura == alturaIntroducida){
         for (i = 1; i <= horizontal; i++) {
        System.out.print(relleno);
        } 
      }
     
      System.out.println();

      altura++;

    }
  }
}
