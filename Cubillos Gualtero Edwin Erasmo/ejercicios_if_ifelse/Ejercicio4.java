package ejercicios_if_ifelse;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("""
                De que municipio eres
                1.Fusagasuga
                2.Bogota
                3.Zipaquira\n""");
        int x = sc.nextInt();

        switch (x) {
            case 1 -> System.out.println("Eres fusagasugeño");
            case 2 -> System.out.println("Eres Bogotano");
            case 3 -> System.out.println("Eres zipaquireño");
            default -> System.out.println("No elegiste una opcion correctamente");
        }
    }
}
