import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;

        System.out.print("Introduzca su nota en valor decimal con punto: ");
        nota = sc.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota no válida");
        }
        else {
            if (nota >= 5) {
                if (nota < 6) {
                    System.out.println("Suficiente");
                }
                else if (nota < 7) {
                    System.out.println("Bien");
                }
                else if (nota < 9) {
                    System.out.println("Notable");
                }
                else if (nota < 10) {
                    System.out.println("Sobresaliente");
                }
                else {
                    System.out.println("Matrícula de honor");
                }
            }
            else {
                System.out.println("Suspenso");
            }
        }
    }
}
