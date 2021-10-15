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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
    int N;
    do {
    System.out.print("Introduce un número entero positivo: ");
    while (!sc.hasNextInt()) {
    System.out.println("Valor no válido");
    sc.next();
    System.out.print("Introduce un número entero positivo: ");
    }
    N = sc.nextInt();
    if(N <= 0){
    System.out.println("El número debe ser positivo");
    }
    } while (N <= 0);
    System.out.println("Número introducido: " + N);

    }
    
}
