/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios13.pkg10.pkg2021;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int dia,mes,año;
        System.out.println("Introduzca el día:");
        dia = sc.nextInt();
        System.out.println("Introduzca el mes:");
        mes = sc.nextInt();
        System.out.println("Introduzca el año:");
        año = sc.nextInt();
        
        if ((dia>=1) && (dia<=mes)){
            if ((mes>=1)&& (mes<=12)){
                if (año != 0){
                System.out.print("La fecha es correcta");  
                }
                 else{ 
                 System.out.print("La fecha es incorrecta, año incorrecto");
                }
            }
               else{ 
           System.out.print("La fecha es incorrecta, mes incorrecto");
            }
        }
        else{ 
        System.out.print("La fecha es incorrecta, dia incorrecto");
        }
    }    
}    
   