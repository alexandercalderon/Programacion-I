package clasemath;

public class Ejercicio3 {

    public static void main(String args[]) {

        int nota1 = (int) (Math.random() * 10);
        int nota2 = (int) (Math.random() * 10);
        int nota3 = (int) (Math.random() * 10);
        int nota4 = (int) (Math.random() * 10);
        int nota5 = (int) (Math.random() * 10);

        int promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        System.out.println("El promedio es: " + promedio);

    }

}
