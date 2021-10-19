package ejercicio;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ingresa la primer nota");
        int nota1 = in.nextInt();

        System.out.println("Ingresa la segunda nota");
        int nota2 = in.nextInt();

        System.out.println("Ingresa la tercer nota");
        int nota3 = in.nextInt();

        int promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("El promedio es: " + promedio);

    }

}
