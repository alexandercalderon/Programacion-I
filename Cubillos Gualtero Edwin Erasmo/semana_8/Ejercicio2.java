package semana_8;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H, M, S;

        System.out.print("Digite la hora: ");
        H = sc.nextInt();

        System.out.print("Digite los minutos: ");
        M = sc.nextInt();

        System.out.print("Digite los segundos: ");
        S = sc.nextInt();

        if (H <= 23 && M <= 59 && S <= 59) {
            System.out.printf("\nHora: %d:%d:%d", H, M, S);
        }
        else {
            if (H >= 24) {
                System.out.println("\nLa hora no es valida");
            }
            else if (M >= 60) {
                System.out.println("\nLos minutos no son validos");
            }
            else {
                System.out.println("\nLos segundos no son validos");
            }
        }
    }
}
