package ejercicios20092021;

public class Ejercicio3 {
    public static void main(String[] args) {

        double nota1 = Math.random() * 5;
        double nota2 = Math.random() * 5;
        double nota3 = Math.random() * 5;
        double nota4 = Math.random() * 5;
        double nota5 = Math.random() * 5;

        double promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        System.out.println("Promedio = " + promedio);
    }
}
