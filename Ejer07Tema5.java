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
 * 7. Realiza el control de acceso a una caja fuerte. La combinaciÃ³n
 *    serÃ¡ un nÃºmero de 4 cifras. El programa nos pedirÃ¡ la combinaciÃ³n
 *    para abrirla. Si no acertamos, se nos mostrarÃ¡ el mensaje
 *    â€œLo siento, esa no es la combinaciÃ³nâ€ y si acertamos se nos dirÃ¡
 *    â€œLa caja fuerte se ha abierto satisfactoriamenteâ€. Tendremos cuatro
 *    oportunidades para abrir la caja fuerte.
 * 
 * @author PocyxDesigner
 */
public class Ejer07Tema5 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int intentos = 4;
    int numeroIntroducido;
    boolean acertado = false;
    
    do {
      System.out.print("Introduzca la clave de la caja fuerte: ");
      numeroIntroducido = Integer.parseInt(s.nextLine());
      
      if (numeroIntroducido == 8888) {
        acertado = true;
      } else {
        System.out.println("Clave incorrecta");
      }
      
      intentos--;
  
    } while((intentos > 0) && (!acertado));
    
    if (acertado) {
      System.out.println("Ha abierto la caja fuerte.");
    } else {
      System.out.println("Lo siento, ha agotado las 4 oportunidades.");
    }
  }
}
