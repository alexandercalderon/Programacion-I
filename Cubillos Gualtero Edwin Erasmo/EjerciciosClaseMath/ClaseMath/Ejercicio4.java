package EjerciciosClaseMath.ClaseMath;

public class Ejercicio4 {
    public static void main(String[] args) {

        double numero1 = Math.random() * 50;
        double numero2 = Math.random() * 50;

        numero1 = Math.ceil(numero1);
        numero2 = Math.ceil(numero2);

        double numeroMayor = Math.max(numero1, numero2);
        System.out.println("El número mayor es = " + numeroMayor);
        System.out.println("Número uno = " + numero1);
        System.out.println("Número dos = " + numero2);
    }
}
