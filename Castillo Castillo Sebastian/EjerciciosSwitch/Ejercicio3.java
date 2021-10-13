package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int mes;

        System.out.println("Ingresa el mes: ");
        mes = in.nextInt();

        if (mes >= 1 && mes <= 12)
        {
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
            {
                System.out.println("El valor corresponde a un mes de 30 dias.");

            } else
            {
                System.out.println("El valor no corresponde a un mes de 30 dias");
            }

        } else
        {
            System.out.println("Error...");
        }
    }

}
