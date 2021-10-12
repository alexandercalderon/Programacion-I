package clasemath;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa el valor de la base: ");
        int base = in.nextInt();

        System.out.print("Ingresa el valor del exponente");
        int exponente = in.nextInt();

        int resultado = (int) (Math.pow(base, exponente));
        System.out.println("El resultado es: " + resultado);

    }

}
