package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String args[]) {

        double nota;
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un valor numerico : ");
        nota = in.nextDouble();

        if (nota < 5)
        {
            System.out.println("Suspenso");

        } else if (nota >= 5 && nota < 6)
        {
            System.out.println("Suficiente");

        } else if (nota >= 6 && nota < 7)
        {
            System.out.println("Bien");

        } else if (nota >= 7 && nota < 9)
        {
            System.out.println("Notable");

        } else if (nota >= 9 && nota < 10)
        {
            System.out.println("Sobresaliente");

        } else if (nota == 10)
        {
            System.out.println("Matricula de honor");

        } else if (nota < 0 || nota > 10)
        {
            System.out.println("Nota no valida");

        }

    }

}
