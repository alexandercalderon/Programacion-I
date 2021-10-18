
package Ejercicios;

import java.util.Scanner;


public class Ejercicio2 {
//Realizar programa que lea tres números enteros H, M, S que contienen hora,
//minutos y * segundos respectivamente, y comprueba si la hora que indican
//es una hora válida.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H,M,S;
        System.out.println("Introduzca la hora");
        H = sc.nextInt();
        System.out.println("Introduzca los minutos");
        M = sc.nextInt();
        System.out.println("Introduzca los segundos");
        S = sc.nextInt();
        if(H<24){
            if(M<60){
                if(S<60){
                    System.out.println("Es una hora valida, la hora es: ");
                    System.out.println(H+":"+S+":"+M);
                }
            }
        }else{
            System.out.println("La hora no es valida.");
        }
    }
    
}
