
package ProgramacionJava;

import java.util.Scanner;


public class Ejercicio4 {

   
    public static void main(String[] args) {
       Scanner clase = new Scanner(System.in);
        int dia;
        System.out.println("Elija un dia de la semana: ");
        dia = clase.nextInt();
        if(dia < 1 && dia > 7)                                   
            System.out.println("No existe");
        else{  
            switch(dia){                                  
                case 1 -> System.out.print("El dia Lunes");
                case 2 -> System.out.print("El dia Martes");
                case 3 -> System.out.print("El dia Miercoles");
                case 4 -> System.out.print("El dia Jueves");
                case 5 -> System.out.print("El dia Viernes");
                case 6 -> System.out.print("El dia Sabado");
                case 7 -> System.out.print("El dia Domingo");  
            }
            switch (dia) {
             case 1, 2, 3 -> System.out.println(" tiene clase de programacion");
             case 4, 5, 6, 7 -> System.out.println(" no tiene clase de programacion");
        }
        }
    }
}
 
