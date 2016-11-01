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
 * 10. Escribe un programa que calcule la media de un conjunto de nÃºmeros
 *     positivos introducidos por teclado. A priori, el programa no sabe
 *     cuÃ¡ntos nÃºmeros se introducirÃ¡n. El usuario indicarÃ¡ que ha terminado
 *     de introducir los datos cuando meta un nÃºmero negativo.
 * 
 * @author PocyxDesigner
 */

public class Ejer10Tema5 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    double numeros = 0;
    double numeroIntroducido = 0;
    double suma = 0;

    System.out.println("Este programa calcula la media de los nÃºmeros positivos introducidos.");
    System.out.println("Vaya introduciendo nÃºmeros (puede parar introduciendo un nÃºmero negativo):");

    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(s.nextLine());
      numeros++;
      suma += numeroIntroducido;
    }
    
    System.out.println("La media de los nÃºmeros positivos introducidos es " + (suma - numeroIntroducido)/ (numeros - 1));

  }
}
