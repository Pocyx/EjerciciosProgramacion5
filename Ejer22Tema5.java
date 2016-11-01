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
 * 22. Muestra por pantalla todos los nÃºmeros primos entre 2 y 100, ambos incluidos.
 * 
 * @author PocyxDesigner
 */
public class Ejer22Tema5 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("NÃºmeros primos entre 2 y 100: ");
       
    boolean esPrimo = true;
    int n;
    int i;

    for (n = 2; n <= 100; n++) {

      // comprueba si n es primo
      esPrimo = true;
      for (i = 2; i < n; i++) {
        if (n%i == 0) esPrimo = false;
      }

      // si n es primo, se muestra por pantalla
      if (esPrimo) {
        System.out.print(n + " ");
      }
    }
    System.out.println();
  }
}
