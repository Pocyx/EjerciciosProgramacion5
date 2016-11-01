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
 * 25. Realiza un programa que pida un nÃºmero por teclado y que luego
 *     muestre ese nÃºmero al revÃ©s.
 * 
 * @author PocyxDesigner
 */
public class Ejer25Tema5 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un nÃºmero entero: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());

    int numero = numeroIntroducido;
    int volteado = 0;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while
    int modulo = numeroIntroducido % 10;
    System.out.println("Si le damos la vuelta al " + numeroIntroducido + " tenemos el " + volteado+" sdgsg= "+modulo);
  }
}
