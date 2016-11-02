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
public class Ejer33Tema5 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca la altura de la U: ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());

    System.out.print("Introduzca el caracter de relleno: ");
    String relleno = s.nextLine();
    
    int altura = 1;
    int i = 0;
     
    while (altura < alturaIntroducida) {
    
      // pinta la linea
      for (i = 1; i <= alturaIntroducida ; i++) {
        
        if (altura == alturaIntroducida)
            System.out.print("  ");
        if(i==1 || i==alturaIntroducida){
            System.out.print(" "+relleno);
        }else{
            System.out.print("  ");
            
        }
        

      }
      System.out.println();

      altura++;
    } 
    while (altura == alturaIntroducida){
          
      
      int horizontal = alturaIntroducida;
      // pinta la horizontal
      if (altura == alturaIntroducida){
         for (i = 1; i <= horizontal; i++) {
            if(i==1 || i == alturaIntroducida){
                System.out.print("  ");
            }else{
                System.out.print(" "+relleno);

            }
        } 
         
      }

      System.out.println();

      altura++;

    }
  }
}
