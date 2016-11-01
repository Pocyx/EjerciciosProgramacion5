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
 * 30. Realiza una programa que calcule las horas transcurridas entre
 *     dos horas de dos dÃ­as de la semana. No se tendrÃ¡n en cuenta los
 *     minutos ni los segundos. El dÃ­a de la semana se puede pedir como
 *     un nÃºmero (del 1 al 7) o como una cadena (de â€œlunesâ€ a â€œdomingoâ€).
 *     Se debe comprobar que el usuario introduce los datos correctamente
 *     y que el segundo dÃ­a es posterior al primero.
 *     Ejemplo:
 *     Por favor, introduzca la primera hora.
 *     DÃ­a: lunes
 *     Hora: 18
 *     Por favor, introduzca la segunda hora.
 *     DÃ­a: martes
 *     Hora: 20
 *     Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
 * 
 * @author PocyxDesigner
 */
public class Ejer30Tema5 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int primerDia = 0;
    int segundoDia = 0;
    int primeraHora;
    int segundaHora;
    String primerDiaString;
    String segundoDiaString;
    String nombrePrimerDia = "";
    String nombreSegundoDia = "";
    boolean datosCorrectos = true;
    
    // Recogida de datos /////////////////////////////////////
    do {
      System.out.println("\nPor favor, introduzca la primera hora.");
      System.out.print("DÃ­a: ");
      primerDiaString = s.nextLine();
      System.out.print("Hora: ");
      primeraHora = Integer.parseInt(s.nextLine());
      
      
      switch(primerDiaString) {
        case "lunes":
        case "1":
          primerDia = 1;
          nombrePrimerDia = "lunes";
          break;
        case "martes":
        case "2":
          primerDia = 2;
          nombrePrimerDia = "martes";
          break;
        case "miÃ©rcoles":
        case "3":
          primerDia = 3;
          nombrePrimerDia = "miercoles";
          break;
        case "jueves":
        case "4":
          primerDia = 4;
          nombrePrimerDia = "jueves";
          break;
        case "viernes":
        case "5":
          primerDia = 5;
          nombrePrimerDia = "viernes";
          break;
        case "sÃ¡bado":
        case "6":
          primerDia = 6;
          nombrePrimerDia = "sÃ¡bado";
          break;
        case "domingo":
        case "7":
          primerDia = 7;
          nombrePrimerDia = "domingo";
          break;
        default:
          primerDia = 0;
      }
      
      System.out.println("Por favor, introduzca la segunda hora.");
      System.out.print("DÃ­a: ");
      segundoDiaString = s.nextLine();
      System.out.print("Hora: ");
      segundaHora = Integer.parseInt(s.nextLine());
      
      switch(segundoDiaString) {
        case "lunes":
        case "1":
          segundoDia = 1;
          nombreSegundoDia = "lunes";
          break;
        case "martes":
        case "2":
          segundoDia = 2;
          nombreSegundoDia = "martes";
          break;
        case "miÃ©rcoles":
        case "3":
          segundoDia = 3;
          nombreSegundoDia = "miÃ©rcoles";
          break;
        case "jueves":
        case "4":
          segundoDia = 4;
          nombreSegundoDia = "jueves";
          break;
        case "viernes":
        case "5":
          segundoDia = 5;
          nombreSegundoDia = "viernes";
          break;
        case "sÃ¡bado":
        case "6":
          segundoDia = 6;
          nombreSegundoDia = "sÃ¡bado";
          break;
        case "domingo":
        case "7":
          segundoDia = 7;
          nombreSegundoDia = "domingo";
          break;
        default:
          segundoDia = 0;
      }
      
      datosCorrectos = true;
      
      if (segundoDia <= primerDia) {
        System.out.println("El segundo dÃ­a debe ser posterior al primero.");
        datosCorrectos = false;
      }
      
      if ((primerDia == 0) || (segundoDia == 0)) {
        System.out.println("No se ha introducido correctamente el dÃ­a de la semana.");
        System.out.println("Los dÃ­as vÃ¡lidos son: lunes, martes, miÃ©rcoles, jueves y viernes.");
        datosCorrectos = false;
      }
      
      if ((primeraHora < 0) || (primeraHora > 23) || (segundaHora < 0) || (segundaHora > 23)) {
        System.out.println("No se ha introducido correctamente la hora del dÃ­a.");
        System.out.println("Las horas vÃ¡lidas estÃ¡n entre 0 y 23.");
        datosCorrectos = false;
      }
      
    } while (!datosCorrectos);
    // Fin de la recogida de datos ///////////////////////////
    
    System.out.print("Entre las " + primeraHora + ":00h del " + nombrePrimerDia);
    System.out.print(" y las " + segundaHora + ":00h del " + nombreSegundoDia);
    System.out.println(" hay " + (((segundoDia * 24) + segundaHora) - ((primerDia * 24) + primeraHora)) + " horas.");

  }
}
