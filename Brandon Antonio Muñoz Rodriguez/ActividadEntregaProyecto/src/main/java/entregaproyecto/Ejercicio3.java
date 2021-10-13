package entregaproyecto;

import java.util.Scanner;


public class Ejercicio3 {
    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        int mes;
        System.out.print("Introduzca número de mes: ");
        mes =  sc.nextInt();
        if(mes < 1 || mes > 12)                                   
            System.out.println("Mes incorrecto");
        else{  
            switch(mes){                                    
                case 1 -> System.out.print("Enero");
                case 2 -> System.out.print("Febrero");
                case 3 -> System.out.print("Marzo");
                case 4 -> System.out.print("Abril");
                case 5 -> System.out.print("Mayo");
                case 6 -> System.out.print("Junio");
                case 7 -> System.out.print("Julio");
                case 8 -> System.out.print("Agosto");
                case 9 -> System.out.print("Septiembre");
                case 10 -> System.out.print("Octubre");
                case 11 -> System.out.print("Noviembre");
                case 12 -> System.out.print("Diciembre");
                
                default -> System.out.println("El mes ingresado no corresponde a un mes con treinta dias (30)");

            }
                
        }
    }
}
