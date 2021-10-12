package ejercicios21092021.EjerciciosOperadores.ClasesOperadores;

public class Ejercicio1 {
    public static void main(String[] args) {

        String name = "Roberto Gomez";

        double nota1 = Math.random() * 5;
        double nota2 = Math.random() * 5;
        double nota3 = Math.random() * 5;
        double nota4 = Math.random() * 5;
        double nota5 = Math.random() * 5;

        double promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

        System.out.printf("""
                Estudiante: %s
                Promedio: %.2f""",
                name, promedio);
    }
}
