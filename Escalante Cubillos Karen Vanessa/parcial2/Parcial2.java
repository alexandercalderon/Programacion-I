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
public class Parcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Digíte la nota: ");
        double nota1;
        nota1 = sc.nextDouble();
       
        
   if (nota1> 10)
        {
            System.out.println("La nota es mayor que 10");
        }
        else {
                System.out.println("La nota es menor que 10");
        }
        }
    }
    

