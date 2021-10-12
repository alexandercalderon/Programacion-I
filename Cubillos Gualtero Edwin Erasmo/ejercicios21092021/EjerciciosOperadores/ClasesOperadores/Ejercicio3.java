package ejercicios21092021.EjerciciosOperadores.ClasesOperadores;

public class Ejercicio3 {
    public static void main(String[] args) {

        int numeroUno = 8;
        int numeroDos = 2;

        int auxiliar;

        auxiliar = numeroUno;
        numeroUno = numeroDos;
        numeroDos = auxiliar;

        System.out.printf("""
                numeroUno: %d
                numeroDos: %d""",
                numeroUno, numeroDos);
    }
}
