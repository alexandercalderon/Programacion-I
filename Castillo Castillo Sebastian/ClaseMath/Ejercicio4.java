package clasemath;

public class Ejercicio4 {

    public static void main(String args[]) {

        double numero1 = Math.random() * 50;
        double numero2 = Math.random() * 50;

        double redondeo1 = Math.round(numero1);
        double redondeo2 = Math.round(numero2);

        double numMayor = Math.max(numero1, numero2);
        System.out.println("El numero mayor es: " + numMayor);
    }

}
