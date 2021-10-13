package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int h, m, s;

        System.out.println("Ingresa las horas: ");
        h = in.nextInt();

        System.out.println("Ingresa los minutos: ");
        m = in.nextInt();

        System.out.println("Ingresa los segundos: ");
        s = in.nextInt();

        if (h <= 12 && m <= 59 && s <= 59)
        {
            System.out.println("La hora es valida");
        } else
        {
            System.out.println("La hora no es valida");
        }
    }

}
