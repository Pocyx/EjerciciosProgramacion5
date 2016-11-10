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
public class Ejer46Tema5 {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("Por favor, introduzca la altura del rectangulo : ");
            int alturaIntroducida = Integer.parseInt(s.nextLine());
            
            System.out.print("Por favor, introduzca la longitud del rectangulo : ");
            int longitudIntroducida = Integer.parseInt(s.nextLine());

            System.out.print("Introduzca el caracter de relleno: ");
            String relleno = s.nextLine();

            int altura = 1;
            int i = 0;
            int espaciosPorDentro = (longitudIntroducida*2)-3;
            if (alturaIntroducida == 2 ||  longitudIntroducida == 2){
                espaciosPorDentro = 1;
            }       
            
            
            

            if(alturaIntroducida >= 2 && longitudIntroducida >= 2){
                while (altura <=alturaIntroducida) {


                    if (altura == 1){
                        // inserta espacios delante
                        for (i = 1; i <= longitudIntroducida; i++) {
                          System.out.print(" "+relleno);
                        }

                      
                        System.out.println();

                      
                    }

                    if (altura > 1 && altura < alturaIntroducida){
                        System.out.print(" "+relleno);
                        for (int a = 1; a <= espaciosPorDentro; a++ ){
                            System.out.print(" ");
                        }
                        System.out.print(relleno);
                        System.out.println();
                                      
                    }
                    

                    if (altura == alturaIntroducida){
                        for (i = 1; i <= longitudIntroducida; i++) {
                          System.out.print(" "+relleno);
                        }
                        System.out.println();
                    }
                    altura++;
                    




                } // while ////////////////////////////

                break;

            }
            
            System.out.println("Valores incorrectos");


        }

  }
    
}
