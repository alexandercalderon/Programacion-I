
package com.mycompany.cajeroautomatico;

import java.util.Scanner;


public class Ejercicio {


    public static void main(String[] args) {
        Scanner  Teclado = new Scanner(System.in);
        int saldo = 20000, retirar, desicionn;
        System.out.println("Bienvenido a al cajero CajaSocial");
        do{
        
        
            System.out.println("Indique que tipo de accion desea realizar: ");
            System.out.println("1. Consultar saldo.");
            System.out.println("2. Retirar dinero.");
            System.out.println("3. Salir.");
            desicionn = Teclado.nextInt();
            if(desicionn==1){
                System.out.println("Su saldo es: "+ saldo);
            }else if(desicionn ==2){
                System.out.println("Indique el monto a retirar: ");
                retirar = Teclado.nextInt();
                if(retirar>saldo){
                    System.out.println("El monto indicado no es valido.");
                }else{
                    saldo = saldo-retirar;
                    System.out.println("Su nuevo saldo es: "+saldo);
                }
            }
        }while(desicionn !=3);
        System.out.println("Transaccion finalizada.");
    }
}
    
