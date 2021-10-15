/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosclasemath;

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
          Scanner entrada = new Scanner(System.in);
          int base, exponente;
          System.out.println("Ingrese el valor de la base: ");
          base = entrada.nextInt();
          System.out.println("Ingrese el valor del exponente: ");
          exponente = entrada.nextInt();
          System.out.println("Potencia= " +Math.pow(base, exponente));
    }
    
}
