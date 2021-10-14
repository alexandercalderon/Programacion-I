package ejercicios13092021;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de horas");
        int hora = sc.nextInt();
        System.out.println();

        int semanas, dias, horas;
        int residuo = hora;

        // Calcula las semanas
        semanas = residuo/168;
        residuo -= semanas * 168;
        // Calcula los dias, ya restada las horas de las semanas
        dias = residuo/24;
        residuo -= dias * 24;
        // Calcula las horas, solo asignandole el residuo de horas
        horas = residuo;

        if (semanas != 0) {
            System.out.printf("""     
                    Semanas: %d
                    Dias: %d
                    Horas: %d
                    """, semanas, dias, horas);
        }
        else if (dias != 0) {
            System.out.printf("""
                    Dias: %d
                    Horas: %d
                    """, dias, horas);
        }
        else {
            System.out.printf("Horas: %d",horas);
        }
    }

}
