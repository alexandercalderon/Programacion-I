package EjerciciosClaseMath.ClaseMath;

public class Ejercicio3 {
    public static void main(String[] args) {

        double nota1 = Math.floor(Math.random() * 11);
        double nota2 = Math.floor(Math.random() * 11);
        double nota3 = Math.floor(Math.random() * 11);
        double nota4 = Math.floor(Math.random() * 11);
        double nota5 = Math.floor(Math.random() * 11);

        double promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        System.out.println("Promedio de las notas = " + promedio);
    }
}
