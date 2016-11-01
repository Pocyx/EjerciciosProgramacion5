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
 * 12. Escribe un programa que muestre los n primeros tÃ©rminos de la
 *     serie de Fibonacci. El primer tÃ©rmino de la serie de Fibonacci
 *     es 0, el segundo es 1 y el resto se calcula sumando los dos
 *     anteriores, por lo que tendrÃ­amos que los tÃ©rminos son 0, 1, 1,
 *     2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El nÃºmero n se debe
 *     introducir por teclado.
 * 
 * @author PocyxDesigner
 */

public class  Ejer12Tema5{

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa muestra los n primeros nÃºmeros de la serie de Fibonacci.");
    System.out.print("Por favor, introduzca n: ");
    int n = Integer.parseInt(s.nextLine());

    switch (n) {
      case 1:
        System.out.print("0");
        break;
      case 2:
        System.out.print("0 1");
        break;
      default:
        System.out.print("0 1");
        int f1 = 0;
        int f2 = 1;
        int aux;
        while(n > 2) {
            aux = f1;
            f1 = f2;
            f2 = aux + f2;
            System.out.print(" " + f2);
            n--;
        }
    }    
    System.out.println();
  }
}
