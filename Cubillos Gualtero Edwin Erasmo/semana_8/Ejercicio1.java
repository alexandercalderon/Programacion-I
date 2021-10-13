package semana_8;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3, nm;

        System.out.print("Digite un número entero: ");
        n1 = sc.nextInt();

        System.out.print("Digite un número entero: ");
        n2 = sc.nextInt();

        System.out.print("Digite un número entero: ");
        n3 = sc.nextInt();

        if (n1 > n2) {
            nm = Math.max(n1, n3);
        }
        else {
            nm = Math.max(n2, n3);
        }

        System.out.printf("El numero mayor es: %d", nm);
    }
}
