/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosprogramacion5;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author PocyxDesigner
 * 
 * 1.Lee int.
 * 2.Muestra sus caracteres.
 * 3.Muestra numero de cifras.
 * 4.Muestra cada cifra.
 * 5.Muestra cifras pares.
 * 6.Muestra la suma de las cifras pares.
 * 7.n o N para salir del programa.
 */
public class Ejer32Tema5 {
      
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un numero entero:");
        Integer numeros = scan.nextInt();
        
        char[] nums = numeros.toString().toCharArray();
        for(char c: nums) {
            System.out.print(c + " ");
        }        
        
        int n, cifras;
        char car;
        do{
            
            n = numeros;
            cifras= 0;    //esta variable es el contador de cifras
            while(n!=0){             //mientras a n le queden cifras
                    n = n/10;         //le quitamos el último dígito
                   cifras++;          //sumamos 1 al contador de cifras
            }
            System.out.println("\nEl número tiene " + cifras+ " cifras");
            
            n = numeros;
            int[] numeross =new int[cifras];
            int p = 0;
            while(n!=0){             //mientras a n le queden cifras
                    int ultima = n%10;         //le quitamos el último dígito
                    n = n / 10;
		    numeross[p]=ultima;
                    System.out.println("\n--------->" +numeross[p]);
                    p++;
            }
            int par = 0;
            
            for(int i=0; i<numeross.length; i++){
               
                if(numeross[i] % 2 == 0){
                   par = numeross[i]+par; 
                   System.out.println("Cifra par: " +numeross[i]);
                }
    
            }
            System.out.println("La suma de sus cifras pares es: "+par);
            System.out.print("Continuar? ");
            car = (char)System.in.read();
            
        }while(car!='n' && car != 'N');
    }
    
}