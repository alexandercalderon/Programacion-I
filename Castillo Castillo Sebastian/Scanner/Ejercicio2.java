package clases;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int N;

        do
        {
            System.out.print("Introduce un numero entero positivo: ");
            while (!in.hasNextInt())
            {

                System.out.println("Valor no valido");
                in.next();
                System.out.print("Introduce un numero entero positivo: ");

            }

            N = in.nextInt();
            if (N <= 0)
            {
                System.out.println("El numero debe ser positivi: ");

            }

        } while (N <= 0);

        System.out.println("Numero introducido: " + N);
    }

}
