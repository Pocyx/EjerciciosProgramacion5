/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosprogramacion5;



/**
 * 5. Bucles
 * 
 * 5. Muestra los nÃºmeros del 320 al 160, contando de 20 en 20 hacia
 *    atrÃ¡s utilizando un bucle while.
 * 
 * @author PocyxDesigner
 */
public class Ejer05Tema5 {

  public static void main(String[] args) {
    

    int i = 320;
    
    while(i >= 160) {
        System.out.println(i);
        i-=20;
    }
  }
}
