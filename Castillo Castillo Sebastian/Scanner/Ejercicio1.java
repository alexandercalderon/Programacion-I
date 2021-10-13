
package clases;

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        String nombre;
        double radio;
        int n;
        
        System.out.print("Introduzca su nombre: ");
        nombre = teclado.nextLine();
        System.out.println("El nombre digitado es: " + nombre);
        
        System.out.print("Introduzca el radio de la circunferencia: ");
        radio = teclado.nextDouble();
        System.out.println("Longitud de la circunferencia " + 2*Math.PI*radio);
        
        System.out.print("Introduzca un numero entero: ");
        n = teclado.nextInt();
        System.out.println("El cuadrado es: " + Math.pow(n, 2));
    }
    
}
