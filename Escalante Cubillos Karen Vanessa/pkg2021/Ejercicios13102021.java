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
public class Ejercicios13102021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Introduzca un número entero:");
        a = sc.nextInt();
        System.out.println("Introduzca un número entero:");
        b = sc.nextInt();
        System.out.println("Introduzca un número entero:");
        c = sc.nextInt();
        if (a== b && b == c){
            System.out.print(" Los tres números son iguales");
        
        } else if ( a>b && a>c ){
            System.out.print(" a es el mayor de los tres números");
        } else if (b>a && b > b){
            System.out.print(" b es el mayor de los tres números");
        }  else{
            System.out.print(" c es el mayor de los tres números");
        }
    }
}    
