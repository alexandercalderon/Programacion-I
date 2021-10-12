package ejercicios_if_ifelse;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba su calificacion con un numero entero: ");
        int calificacion = sc.nextInt();

        if (calificacion >= 90) {
            System.out.println("A");
        }
        else if(calificacion >= 80) {
            System.out.println("B");
        }
        else if(calificacion >= 70) {
            System.out.println("C");
        }
        else if(calificacion >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}
