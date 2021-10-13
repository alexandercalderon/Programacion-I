package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Ingresa el primer numero: ");
        num1 = in.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        num2 = in.nextInt();

        System.out.print("Ingresa el tercer numero: ");
        num3 = in.nextInt();

        if (num1 > num2 && num1 > num3)
        {
            System.out.println("El numero mayor es: " + num1);

        } else if (num2 > num3)
        {
            System.out.println("El numero mayor es: " + num2);

        } else
        {
            System.out.println("El numero mayor es: " + num3);
        }
    }

}
