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
public class Ejer38Tema5 {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("Por favor, introduzca la altura del reloj de arena: ");
            int alturaIntroducida = Integer.parseInt(s.nextLine());

            System.out.print("Introduzca el caracter de relleno: ");
            String relleno = s.nextLine();

            int altura = 1;
            int i = 0;
            int espaciosDelante = 0;
            int espaciosDelante2  = 0;
            int espaciosDentro = alturaIntroducida - 2;
            int numCaracter = alturaIntroducida;
            //La condicion es introducir un numero impar mayor que 3.
            if(alturaIntroducida > 3 && alturaIntroducida%2 != 0){
                //pinta la figura completa a la altura introducida.
                while (altura <= alturaIntroducida){
                    //Pinta la parte superior de la figura.
                    if (altura < (alturaIntroducida/2)+1) {
                        //Pinta los espacion delante.
                        for (int a = 1; a <= espaciosDelante; a++ ){
                              System.out.print(" ");
                        }

                        //Pinta la linea 
                        for (i = 1; i <= numCaracter ; i++) {

                          System.out.print(relleno); 

                        }

                        
                        

                        System.out.println();

                        espaciosDelante++;
                        espaciosDentro -= 2;
                        numCaracter -=2;
                    }
                    //Pinta la linea central de la figura
                    if (altura == (alturaIntroducida/2)+1){
                        for (int a = 1; a <= espaciosDelante; a++ ){
                            System.out.print(" ");
                        }
                        System.out.println(relleno);
                        
                    }
                    //Pinta la parte inferior de la figura. 
                    if (altura > (alturaIntroducida/2)+1){
                        //altura++;
                        espaciosDelante--;
                        espaciosDentro += 2;
                        for (int a = 1; a <= espaciosDelante; a++ ){
                            System.out.print(" ");
                        }
                        for (i = 1; i <= 1 ; i++) {

                            System.out.print(relleno); 

                        }
                        for (int b = 1; b <= espaciosDentro; b++ ){
                            System.out.print(relleno);
                        }
                        for (i = 1; i <= 1 ; i++) {

                            System.out.println(relleno); 
                        }
                        
                    }
                    altura++;
                    
                }
                break;

            }
            
        }
        
    }
}
