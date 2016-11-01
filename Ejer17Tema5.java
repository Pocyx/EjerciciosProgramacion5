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
 * 17. Realiza un programa que sume los 100 nÃºmeros  siguientes a un nÃºmero entero y positivo
 *     introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es
 *     un nÃºmero positivo).
 * 
 * @author PocyxDesigner
 */
public class Ejer17Tema5 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int numeroIntroducido = 0;
    
    do {
      System.out.print("Introduzca un nÃºmero entero positivo: ");
      numeroIntroducido = Integer.parseInt(s.nextLine());
      
      if(numeroIntroducido < 0) {
        System.out.println("El nÃºmero introducido no es correcto, debe introducir un nÃºmero positivo.");
      }
    } while (numeroIntroducido < 0);
    
    int suma = 0;
    
    for(int i = numeroIntroducido; i < numeroIntroducido + 100; i++) {
      suma += i;
    }

    System.out.println("La suma de los 100 nÃºmeros siguientes a " + numeroIntroducido + " es " + suma);
  }
}
