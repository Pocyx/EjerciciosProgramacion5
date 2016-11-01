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
 * 29. Escribe un programa que muestre por pantalla  todos  los nÃºmeros enteros positivos menores
 *     a uno leÃ­do por teclado que no sean divisibles entre otro tambiÃ©n leÃ­do de igual forma.
 * 
 * @author PocyxDesigner
 */
public class Ejer29Tema5 {

  public static void main(String[] args) {
      
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un nÃºmero entero positivo (relativamente grande): ");
    int numeroGrande = Integer.parseInt(s.nextLine());

    System.out.print("Introduzca otro nÃºmero (relativamente pequeÃ±o): ");
    int numeroPequeno = Integer.parseInt(s.nextLine());

    System.out.print("Los nÃºmeros enteros positivos menores que " + numeroGrande );
    System.out.println(" que no son divisibles entre " + numeroPequeno + " son los siguientes:");

    int cuenta = 0;
    int suma = 0;

    for (int i = 1; i < numeroGrande; i++) {
      if ((i % numeroPequeno) != 0) {
        System.out.print(i + " ");
      }
    }
  }
}
