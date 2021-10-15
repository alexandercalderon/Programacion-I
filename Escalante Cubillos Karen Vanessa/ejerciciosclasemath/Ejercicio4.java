/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosclasemath;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
         Double a,b;
         System.out.println("Ingrese el primer valor:");
         a = entrada.nextDouble();
         System.out.println("Ingrese el segundo valor:");
         b = entrada.nextDouble();
   
    System.out.println("Número redondeado= " +Math.round(a*10));
    System.out.println("Número redondeado= " +Math.round(b*10));
    
    System.out.println("El número mayor es: " +Math.max(a, b));
    }
    
}
