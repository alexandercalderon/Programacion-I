package ejercicios_if_ifelse;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de x: ");
        int x = sc.nextInt();

        System.out.print("Valor de y: ");
        int y = sc.nextInt();

        if (x > 5){
            System.out.println("x > 5 && y <= 5");
            if (y > 5) {
                System.out.println("x & y son > 5");
            }
        }
        else {
            System.out.println("x & y <= 5");
            if (y > 5) {
                System.out.println("y > 5 && x <= 5");
            }
        }


    }
}
