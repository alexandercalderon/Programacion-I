
package com.mycompany.ejercicios_if_ifelse_while;

import java.util.Scanner;


public class If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nota");
        int calificacionEstudiante = sc.nextInt();
        
        if (calificacionEstudiante >=90)
            System.out.println("A");
        else 
                if (calificacionEstudiante >=80)
                System.out.println("B");
                else
                    if (calificacionEstudiante >=70)
                    System.out.println("C");
                    else
                        if (calificacionEstudiante >=60)
                        System.out.println("D");
                        else
                            System.out.println("F");
                     
              
         
        
        
    }
    
}
