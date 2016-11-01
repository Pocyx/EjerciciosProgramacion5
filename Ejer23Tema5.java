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
 * 23. Escribe un programa que permita ir introduciendo una serie indeterminada
 *     de nÃºmeros mientras su suma no supere  el valor 10000. Cuando esto Ãºltimo
 *     ocurra, se debe mostrar el total acumulado, el contador de los nÃºmeros
 *     introducidos y la media.
 * 
 * @author PocyxDesigner
 */
public class Ejer23Tema5{

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Por favor, vaya introduciendo nÃºmeros.");
    System.out.println("El programa terminarÃ¡ cuando la suma de los nÃºmeros sea mayor que 10000.");
    
    int numeroIntroducido;
    int suma = 0;
    int numeroDeElementos = 0;
    
    do {
      numeroIntroducido = Integer.parseInt(s.nextLine());
      suma += numeroIntroducido;
      numeroDeElementos++;
    } while (suma <= 10000);
    
    System.out.println("Ha introducido un total de " + numeroDeElementos + " nÃºmeros.");
    System.out.println("La suma total es " + suma + ".");
    System.out.println("La media es " + suma / numeroDeElementos + ".");
  }
}
