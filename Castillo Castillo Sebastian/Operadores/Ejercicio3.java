package clasesoperadores;

public class Ejercicio3 {

    public static void main(String args[]) {

        int numeroUno = 8, numeroDos = 2;

        int auxiliar = numeroUno;
        numeroUno = numeroDos;
        numeroDos = auxiliar;

        System.out.println("El valor de la variable numero uno es : " + numeroUno);
        System.out.print("El valor de la variable numero dos es : " + numeroDos);
    }

}
