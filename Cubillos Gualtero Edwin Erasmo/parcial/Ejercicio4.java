import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia;

        System.out.print("Digite el numero del dia: ");
        dia = sc.nextInt();

        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Numero no valido de dia.");
        }

        if (dia == 1 || dia == 2 || dia == 3){
            System.out.println("Si hay clase de programación");
        }
        else {
            System.out.println("No hay clase de programación");
        }
    }
}
