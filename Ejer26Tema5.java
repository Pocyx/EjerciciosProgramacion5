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
 * 26. Realiza un programa que pida primero un nÃºmero y a continuaciÃ³n un dÃ­gito. El programa nos
 *     debe dar la posiciÃ³n (o posiciones) contando de izquierda a derecha que ocupa ese dÃ­gito en
 *     el nÃºmero introducido.
 * 
 * @author PocyxDesigner
 */
public class Ejer26Tema5 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un nÃºmero entero: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());

    System.out.print("Introduzca un dÃ­gito: ");
    int digito = Integer.parseInt(s.nextLine());

    System.out.print("Contando de izquierda a derecha, el " + digito + " aparece dentro de " + numeroIntroducido + " en las siguientes posiciones: ");
    
    // le da la vueta al nÃºmero y calcula la longitud
    int numero = numeroIntroducido;
    int volteado = 0;
    int longitud = 0;
    int posicion = 1;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } // while
        
    // comprueba la posiciÃ³n
    while (volteado > 0) {
      if ((volteado % 10) == digito) {
        System.out.print(posicion + " ");
      }
      volteado /= 10;
      posicion++;
    } // while

    System.out.println();
  }
}
