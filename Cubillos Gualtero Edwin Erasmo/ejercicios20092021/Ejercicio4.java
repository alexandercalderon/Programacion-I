package ejercicios20092021;

public class Ejercicio4 {
    public static void main(String[] args) {

        double number1 = Math.random() * 50;
        double number2 = Math.random() * 50;

        number1 = Math.round(number1);
        number2 = Math.round(number2);

        double numero_mayor = Math.max(number1, number2);

        System.out.println("Numero Mayor = " + numero_mayor);
    }
}
