package ejercicios_for_while;

import java.util.Scanner;

public class Ejercicio1 {

    private String nombreDelCurso;

    public Ejercicio1(String nombre) {
        this.nombreDelCurso = nombre;
    }

    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }

    public void showMessage() {
        System.out.printf("Bienvenido al libro de calificaciones para\n%s!\n\n", getNombreDelCurso());
    }

    public void determinarPromedio() {
        Scanner sc = new Scanner(System.in);

        int total, contadorCalif, calificacion, promedio;

        total = 0;
        contadorCalif = 1;

        while (contadorCalif <= 10) {
            System.out.print("Escriba la calificación: ");
            calificacion = sc.nextInt();
            total += calificacion;
            contadorCalif++;
        }

        promedio = total / 10;

        System.out.printf("\nEl total de las 10 calificaciones es %d\n", total);
        System.out.printf("El promedio de la clase es %d\n", promedio);
    }

    public static void main(String[] args) {

        Ejercicio1 libroCalificaciones = new Ejercicio1("Programacion I");

        libroCalificaciones.showMessage();
        libroCalificaciones.determinarPromedio();
    }
}
