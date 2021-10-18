
package Scanner;

import java.util.Scanner;


public class Ejercicio1 {


    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        String nombre;
        int n; 
        double radio;
        System.out.println("Introduzca su nombre:");
        nombre = Teclado.nextLine();
        System.out.println("El nombre digitado es: "+ nombre);
        
        System.out.println("Introduzca el radio de la circunferencia: ");
        radio = Teclado.nextDouble();
        System.out.println("Longitud de la circunferencia: "+ 2*Math.PI*radio);
        
        System.out.println("Introduzca un numero entero: ");
        n = Teclado.nextInt();
        System.out.println("El cuadrado es: "+ Math.pow(n, 2));
    }
    
}
