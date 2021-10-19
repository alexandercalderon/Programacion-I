
package com.mycompany.automatizarellbanco;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        double saldo = 100000;
        double saldot;
      
                
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = sc.nextLine();
        
        double retiro;
        Scanner rt = new Scanner(System.in);
        System.out.println("Cuanto dinero desea retirar:");
        retiro = sc.nextDouble();
        
        saldot = saldo-retiro;
      
        
        System.out.println("Saldo: "+saldot);
        
        
    }
       
}
