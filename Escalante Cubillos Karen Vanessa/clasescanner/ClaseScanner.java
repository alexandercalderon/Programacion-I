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
public class ClaseScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Introduzca un número entero:");
        n = sc.nextInt();
        
        double x;
        System.out.println("Introduzca el número de tipo Double: ");
        x = sc.nextDouble();
        
        String s;
        System.out.println("Introduzca texto:");
        s = sc.nextLine();
        
        Long in;
        System.out.println("Introduzca un número: ");
        in = sc.nextLong();
        
        
        
    }
    
}
