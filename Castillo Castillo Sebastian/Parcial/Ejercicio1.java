package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int nota;

        System.out.println("Ingresa una nota: ");
        nota = in.nextInt();

        if (nota > 10)
        {
            System.out.println("La nota es mayor que 10");

        } else if (nota < 10)
        {
            System.out.println("La nota es menor que 10");

        }
    }

}
