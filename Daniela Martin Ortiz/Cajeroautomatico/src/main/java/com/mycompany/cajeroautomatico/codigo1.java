
package com.mycompany.cajeroautomatico;

import java.util.Scanner;


public class codigo1 {

  
    public static void main(String[] args) {
        Scanner banco = new Scanner(System.in); 
       int saldoinicial = 1000000; 
       int retirar, consultar, cuenta; 
        System.out.println("Bienvenido a su cajero automatico\n "); 
        System.out.println("Ingrese su numero de cuenta\n "); 
        cuenta = banco.nextInt(); 
        System.out.println("Su saldo inicial es:\n "+saldoinicial); 
        System.out.println("Cuanto desea retirar:\n "); 
        retirar= banco.nextInt(); 
        if(retirar > saldoinicial ){ 
       System.out.println("Saldo insuficiente \n Por favor intentelo de nuevo.\n\n\n"); 
       codigo1.main (null); 
       
       } 
        if (retirar < saldoinicial){ 
        consultar = saldoinicial-retirar; 
        System.out.println("Su saldo final es:\n "+consultar);  
     
  
    
            } 
    }      
}
        
   