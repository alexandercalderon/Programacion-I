/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasescanner;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
Scanner teclado = new Scanner(System.in); //Se crea un objeto Scanner
String nombre;
double radio;
int n;
System.out.println("Introduzca su nombre: ");
nombre = teclado.nextLine(); //leer un String
System.out.println("El nombre digitado es :" +nombre);
System.out.print("Introduzca el radio de la circunferencia: ");
radio = teclado.nextDouble(); //leer un double
System.out.println("Longitud de la circunferencia: " + 2*Math.PI*radio);

System.out.println("Introduzca un número entero: ");
n = teclado.nextInt(); //leer un entero
System.out.println("El cuadrado es: " + Math.pow(n,2));

        }

}
