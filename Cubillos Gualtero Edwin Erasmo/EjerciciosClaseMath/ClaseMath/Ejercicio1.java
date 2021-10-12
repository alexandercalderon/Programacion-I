package EjerciciosClaseMath.ClaseMath;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int base, exponente;

        System.out.print("Introduce el valor de la base: ");
        base = sc.nextInt();

        System.out.print("Introduce el valor del exponente: ");
        exponente = sc.nextInt();

        var potencia = Math.pow(base, exponente);

        System.out.println("Potencia = " + potencia);
    }
}
