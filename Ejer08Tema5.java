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
 * 8. Muestra la tabla de multiplicar de un nÃºmero introducido por teclado.
 * 
 * @author PocyxDesigner
 */
public class Ejer08Tema5 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un nÃºmero entero y le mostrarÃ© la tabla de multiplicar: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());
        
    for (int i = 0; i <= 10; i++) {
      System.out.println(numeroIntroducido + " x " + i + " = " + numeroIntroducido * i);
    }

  }
}
