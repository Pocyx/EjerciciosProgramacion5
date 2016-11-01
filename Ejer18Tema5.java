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
 * 18. Escribe un programa que obtenga los nÃºmeros enteros comprendidos entre dos nÃºmeros
 *     introducidos por teclado y validados como distintos, el programa debe empezar por
 *     el menor de los enteros introducidos e ir incrementando de 7 en 7.
 * 
 * @author PocyxDesigner
 */

public class Ejer18Tema5 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int primerNumero;
    int segundoNumero;
    
    // pide dos nÃºmeros y se verifica que sean distintos
    do {
      System.out.print("Introduzca un nÃºmero entero: ");
      primerNumero = Integer.parseInt(s.nextLine());
      System.out.print("Introduzca otro nÃºmero entero distinto al anterior: ");
      segundoNumero = Integer.parseInt(s.nextLine());
      
      if(primerNumero == segundoNumero) {
        System.out.println("Los nÃºmeros introducidos no son vÃ¡lidos, deben ser distintos.");
      }
    } while (primerNumero == segundoNumero);
    
    // si el primer nÃºmero es mayor que el segundo, se intercambian los valores
    if (primerNumero > segundoNumero) {
      int aux = primerNumero;
      primerNumero = segundoNumero;
      segundoNumero = aux;
    }
    
    for(int i = primerNumero; i <= segundoNumero; i += 7) {
      System.out.print(i + " ");
    }
    
    System.out.println();
  }
}
