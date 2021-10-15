/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero2709;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Cajero2709 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int tarjeta, clave, retirar, consultar, salir;
        int opcion = 3;
        char seguir ='s';
        
        double saldo = Math.random()*10000000;
        String opcionString;
        System.out.println("Introduzca la tarjeta: " );
        tarjeta = entrada.nextInt();
        
        System.out.println("Introduzca su clave: " );
        clave = entrada.nextInt();
        
     
      while (seguir == 's'){

        System.out.println("Seleccione una opción: ") ;
        System.out.println("1. Consultar");
        System.out.println("2. Retirar");
        System.out.println("3. Salir");
         opcion = entrada.nextInt();
        
        switch (opcion)
             
        {   
            case 1: 
                System.out.println("Su saldo es: " +saldo);
                break;
            case 2: 
                System.out.println("Cuanto desea retirar: ");
                retirar = entrada.nextInt();
                if (retirar<= saldo){
                    saldo = saldo - retirar;
                    System.out.println("Su nuevo saldo es: " +saldo);
                }else{
                    System.out.println("Fondos insuficientes: " +saldo);
                }
            break;
            case 3: 
               System.out.println("Gracias por usar nuestro cajero");
               return;
              
            default: 
                System.out.println("Selección incorrecta");
        }
             
        System.out.println("¿Desea continuar? s / n");
        seguir = entrada.next().charAt(0);
       
{
        if (seguir=='n')
        System.out.println("Gracias por usar nuestro cajero");
        }
    }
  }
}
    
    

