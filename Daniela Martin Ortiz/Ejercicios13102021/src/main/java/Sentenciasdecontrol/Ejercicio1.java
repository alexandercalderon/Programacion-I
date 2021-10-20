
package Sentenciasdecontrol;

import java.util.Scanner;

public class Ejercicio1 {

   
    public static void main(String[] args) {
      
        Scanner sentencia = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Digite 3 numeros enteros: ");
         num1 = sentencia.nextInt();
         num2 = sentencia.nextInt();
         num3 = sentencia.nextInt();
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El mayor es: " + num1);                                             
            } else {
                System.out.println("El mayor es: " + num3);     
            }
        } else 
            if (num2 > num3) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("El mayor es: " + num3);
        }
    }
}
    
