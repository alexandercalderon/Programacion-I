/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasemath;

import java.util.Scanner;

/**
 *
 * @author fabia
 */
public class Clasemath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int base, exponente;

        System.out.print("Introduce el valor de la base: ");
        base = sc.nextInt();

        System.out.print("Introduce el valor del exponente: ");
        exponente = sc.nextInt();

        var potencia = Math.pow(base, exponente);

        System.out.println("Potencia = " + potencia);
    }
    
}
