
package Ejercicios;

import java.util.Scanner;


public class Ejercicio3 {
//Realizar programa que lea una variable entera mes y compruebe si el valor
//corresponde * a un mes de 30 días. Se debe comprobar que el valor
//introducido esté * comprendido entre 1 y 12.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;
        System.out.println("Introduzca el numero del mes:");
        mes = sc.nextInt();
        if(mes<=12){
            switch(mes){
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Si corresponde a un mes con 30 días.");
                    break;
                default:
                    System.out.println("No corresponde a un mes con 30 días.");
                    break;
                
            }
        }else{
            System.out.println("Error. El valor introducido no corresponde a un mes");
        }
    }
    
}
