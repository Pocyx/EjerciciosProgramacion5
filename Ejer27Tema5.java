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
 * 27. Escribe un programa que muestre, cuente y sume los  mÃºltiplos de 3 que hay entre 1 y un
 *     nÃºmero leÃ­do por teclado.
 * 
 * @author PocyxDesigner
 */
public class Ejer27Tema5 {

  public static void main(String[] args) {
      
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un nÃºmero entero mayor que 1: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());

    int cuenta = 0;
    int suma = 0;
    
    for (int i = 1; i < numeroIntroducido; i++) {
      if ((i % 3) == 0) {
        System.out.print(i + " ");
        cuenta++;
        suma += i;
      }
    }
        
    System.out.print("\nDesde 1 hasta " + numeroIntroducido + " hay " + cuenta);
    System.out.println(" mÃºltiplos de 3 y suman " + suma);
  }
}
