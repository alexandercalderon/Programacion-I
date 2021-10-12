package clasescanner;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Introduzca un número entero: ");
        n = sc.nextInt();
        System.out.println("Número entero: " + n);

        double x;
        System.out.print("Introduzca número de tipo double: ");
        x = sc.nextDouble();
        System.out.println("Número tipo double: " + x);

        String s;
        System.out.print("Introduzca texto: ");
        s = sc.nextLine();
        System.out.println("Texto: " + s);

        long ln;
        System.out.print("Introduzca un número: ");
        ln = sc.nextLong();
        System.out.println("Número tipo long: " + ln);
    }
}
