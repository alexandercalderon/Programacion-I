package clasescanner;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre;
        double radio;
        int n;

        System.out.println("Introduzca su nombre: ");
        nombre = sc.nextLine();
        System.out.println("El nombre digitado es: " + nombre);

        System.out.println("Introduzca el radio de la circunferencia: ");
        radio = sc.nextDouble();
        System.out.println("Longitud de la circunferencia: " + 2 * Math.PI * radio);

        System.out.println("Introduzca un número entero: ");
        n = sc.nextInt();
        System.out.println("El cuadrado es: " + Math.pow(n, 2));
    }
}
