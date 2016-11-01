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
 * 21. Realiza un programa que vaya pidiendo nÃºmeros hasta que se introduzca un numero negativo y
 *    nos diga cuantos nÃºmeros se han introducido, la media de los impares y el mayor de los pares.
 *    El nÃºmero negativo sÃ³lo se utiliza para indicar el final de la introducciÃ³n de datos pero no
 *    se incluye en el cÃ³mputo.
 * 
 * @author PocyxDesigner
 */
public class Ejer21Tema5 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.println("Por favor, vaya introduciendo nÃºmeros enteros.");
    System.out.println("Puede terminar mediante la introducciÃ³n de un nÃºmero negativo.");

    int numeroIntroducido;
    int numeroDeElementos = 0;
    int sumaImpares = 0;
    int numeroDeElementosImpares = 0;
    int maximoPar = 0;
    
    do {
      numeroIntroducido = Integer.parseInt(s.nextLine());
      
      if (numeroIntroducido >= 0) {
        numeroDeElementos++;
        if ((numeroIntroducido % 2) == 1) { // nÃºmero impar
          sumaImpares += numeroIntroducido;
          numeroDeElementosImpares++;
        } else { // nÃºmero par
          if (numeroIntroducido > maximoPar)
            maximoPar = numeroIntroducido;
        }
      }
    } while (numeroIntroducido >= 0);

    System.out.println("Ha introducido " + numeroDeElementos + " nÃºmeros");
    System.out.println("La media de los impares es " + sumaImpares/numeroDeElementosImpares);
    System.out.println("El mÃ¡ximo de los pares es " + maximoPar);
  }
}
