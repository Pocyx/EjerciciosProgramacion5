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
public class Ejer40Tema5 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    while(true){
        System.out.print("Por favor, introduzca la altura del rombo : ");
        int alturaIntroducida = Integer.parseInt(s.nextLine());

        System.out.print("Introduzca el caracter de relleno: ");
        String relleno = s.nextLine();

        int altura = 1;
        int i = 0;
        int espaciosPorDelante = alturaIntroducida - 1;
        int espaciosInternos = 0;
        
        if(alturaIntroducida > 3 && alturaIntroducida%2 != 0){
            while (altura <=alturaIntroducida) {


                if (altura < (alturaIntroducida/2)+1){
                    // inserta espacios delante
                    for (i = 1; i <= espaciosPorDelante; i++) {
                      System.out.print(" ");
                    }

                    // pinta la linea
                    System.out.print(relleno);
                    for (i = 1; i < espaciosInternos; i++) {
                      System.out.print(" ");
                    }

                    if (altura>1) {
                      System.out.print(relleno);
                    }

                    System.out.println();

                    espaciosPorDelante--;
                    espaciosInternos += 2;
                }

                if (altura == (alturaIntroducida/2)+1){
                    for (int a = 1; a <= espaciosPorDelante; a++ ){
                        System.out.print(" ");
                    }
                    System.out.print(relleno);
                    for (i = 1; i < espaciosInternos; i++) {
                        System.out.print(" ");
                    }

                    if (altura>1) {
                        System.out.println(relleno);
                    }               
                }

                if (altura > (alturaIntroducida/2)+1 && altura < alturaIntroducida){
                    espaciosPorDelante++;
                    espaciosInternos -= 2;
                    // inserta espacios delante
                    for (i = 1; i <= espaciosPorDelante; i++) {
                      System.out.print(" ");
                    }

                    // pinta la linea
                    System.out.print(relleno);
                    for (i = 1; i < espaciosInternos; i++) {
                      System.out.print(" ");
                    }

                    if (altura>1) {
                      System.out.print(relleno);
                    }

                    System.out.println();
                }
                altura++;
                if (altura==alturaIntroducida){
                    // base del rombo
                    for (i = 1; i <= 1; i++) {
                        espaciosPorDelante++;
                        // inserta espacios delante
                            for (i = 1; i <= espaciosPorDelante; i++) {
                              System.out.print(" ");
                            }
                            System.out.println(relleno);
                    }
                }
                
                


            } // while ////////////////////////////

            break;
            
        }

        
    }
    
  }
    
}
