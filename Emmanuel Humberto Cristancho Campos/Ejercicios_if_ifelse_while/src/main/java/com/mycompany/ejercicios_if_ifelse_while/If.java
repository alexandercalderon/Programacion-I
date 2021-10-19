
package com.mycompany.ejercicios_if_ifelse_while;

import java.util.Scanner;


public class If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nota");
        int calificacionEstudiante = sc.nextInt();
        
        if (calificacionEstudiante >=60)
            System.out.println("Aprobado");
    }
    
}
