package ejercicios_if_ifelse;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba su calificacion con un numero entero: ");
        int calificacion = sc.nextInt();

        if (calificacion >= 60)
            System.out.println("Aprobado");
        else
            System.out.println("Reprobrado");
    }
}
