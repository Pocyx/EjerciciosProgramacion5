/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosprogramacion5;



/**
 * 5. Bucles
 * 
 * 6. Muestra los nÃºmeros del 320 al 160, contando de 20 en 20
 *    utilizando un bucle do-while.
 * 
 * PocyxDesigner
 */
public class Ejer06Tema5 {

  public static void main(String[] args) {
    

    int i = 320;
    
    do {
      System.out.println(i);
      i-=20;
    } while(i >= 160);
  }
}
