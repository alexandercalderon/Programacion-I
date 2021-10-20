import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.print("Introduzca una nota en numero entero: ");
        nota = sc.nextInt();

        System.out.printf("Su nota es %s que 10\n",
                (nota > 10) ? "mayor" : (nota < 10) ? "menor" : "igual");
    }
}
