
package Ifs;

import java.util.Scanner;


public class Ejercicio1 {


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double calificacionesEstudiante;
        System.out.println("Introduzca la calificacion del estudiante: ");
        calificacionesEstudiante = sc.nextDouble();
    if(calificacionesEstudiante>=90)
            System.out.println("A");
    else
        if(calificacionesEstudiante>=80)
            System.out.println("B");
        else
            if(calificacionesEstudiante>=70)
                System.out.println("C");
             else
                if(calificacionesEstudiante>=60)
                    System.out.println("D");
                else
                    System.out.println("F");
    if(calificacionesEstudiante>=60){
        System.out.println("Aprobado");
    }else{
        System.out.println("Reprobado");
        System.out.println("Debes realizar el curso otra vez");
    }
                
    }
    
}
