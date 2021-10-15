/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios13092021;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicios13092021 {

    /**
     * @param args the command line arguments
     *///Construir un programa que dado un número total de horas,devuelva el número de semanas, días y horas equivalentes
       //Ejemplo. Si tenemos 1000 horas, nos debería dar, 5 semanas, 6 días y 16 horas.
      
         
         
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int totalHrs, semanas, dias, horas;
        
       System.out.println("Digíte las horas: ");
       totalHrs = entrada.nextInt();
       
       semanas = totalHrs / 168;
       dias = totalHrs%168 / 24;
       horas = totalHrs%24;
       
       System.out.println("El equivalente de las horas es: ");
        System.out.println(semanas + "semanas. ");
        System.out.println(dias + "dias. ");
        System.out.println(horas + "horas. ");
       
    } 
      
    
    
    
}
