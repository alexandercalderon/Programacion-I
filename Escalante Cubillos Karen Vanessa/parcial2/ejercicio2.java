/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Digíte la nota: ");
        double nota1;
        nota1 = sc.nextDouble();
        
         if ((nota1< 5)&&(nota1>=0)) 
        {
            System.out.println("Suspenso");
        }
        
        else if ((nota1 >= 5)&& (nota1< 6))
          {
            System.out.println("Suficiente");
        }   
        
        else if ((nota1 >= 6)&& (nota1< 7))
          {
            System.out.println("Bien");
          } 
        
        else if ((nota1 >= 7)&& (nota1< 9))
          {
            System.out.println("Notable");
        }
        
         else if ((nota1 >= 9)&& (nota1< 10))
          {
            System.out.println("Sobresaliente");
        }
         
         else if (nota1 == 10)
         {
             System.out.println("Matricula de honor");
        
         }
         
         else if ((nota1 < 0)||(nota1> 10))
          {
            System.out.println("Nota no válida");
        }
    }
    
}
